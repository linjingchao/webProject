package com.gupaoedu.vip.pattern.proxy.dynamicproxy.gpproxy;


import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class GPProxy {
    public static void main(String[] args) {
        //System.out.println(generateSrc(new Girl().getClass().getInterfaces()));
        //System.out.println(GPProxy.class.getResource("").getPath());
    }

    public static Object newProxyInstance(GPClassLoader classLoader,Class<?>[] interfaces,GPInvocationHandler h){
        try{
            //生成.java文件
            String src= generateSrc(interfaces);
            
            //文件输出磁盘
            String filePath = GPProxy.class.getResource("").getPath();
            File f =new File(filePath + "$Proxy0.java");
            FileWriter fw =new FileWriter(f);
            fw.write(src);
            fw.flush();
            fw.close();

            //java文件变成class文件
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager manager = compiler.getStandardFileManager(null,null,null);
            Iterable iterable = manager.getJavaFileObjects(f);

            JavaCompiler.CompilationTask task = compiler.getTask(null,manager,null,null,null,iterable);
            task.call();
            manager.close();

            //编译生成的.class文件加载到JVM中
            Class proxyClass = classLoader.findClass("$Proxy0");
            Constructor c =proxyClass.getConstructor(GPInvocationHandler.class);
            f.delete();

            //返回字节码重组以后的新的代理对象
            return c.newInstance(h);
        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    private static String generateSrc(Class<?>[] interfaces){
        StringBuffer sb = new StringBuffer();
        sb.append("package com.gupaoedu.vip.pattern.proxy.dynamicproxy.gpproxy;\r\n");
        sb.append("import com.gupaoedu.vip.pattern.proxy.inter.Person;\r\n");
        sb.append("import java.lang.reflect.*;\r\n");
        sb.append("public class $Proxy0 implements " + interfaces[0].getName() + "{\r\n");
        sb.append("GPInvocationHandler h;\r\n");
        sb.append("public $Proxy0(GPInvocationHandler h) { \r\n");
        sb.append("this.h = h;");
        sb.append("}\r\n");
//        for(Method m : interfaces[0].getMethods()){
//            sb.append("public "+m.getReturnType().getName()+" "+m.getName()+"() throws Throwable {"+"\r\n");
//            sb.append("try {\r\n");
//            sb.append("Method m =" + interfaces[0].getName()+".class.getMethod(\""+m.getName()+"\",new Class[]{});"+"\r\n");
//            sb.append("this.h.invoke(this,m,null);\r\n");
//            sb.append("}catch(Exception e){\r\n");
//            sb.append("e.printStackTrace();\r\n");
//            sb.append("}\r\n");
//            sb.append("}");
//        }
//        sb.append("}");
        for (Method m : interfaces[0].getMethods()){
            Class<?>[] params = m.getParameterTypes();

            StringBuffer paramNames = new StringBuffer();
            StringBuffer paramValues = new StringBuffer();
            StringBuffer paramClasses = new StringBuffer();

            for (int i = 0; i < params.length; i++) {
                Class clazz = params[i];
                String type = clazz.getName();
                String paramName = toLowerFirstCase(clazz.getSimpleName());
                paramNames.append(type + " " +  paramName);
                paramValues.append(paramName);
                paramClasses.append(clazz.getName() + ".class");
                if(i > 0 && i < params.length-1){
                    paramNames.append(",");
                    paramClasses.append(",");
                    paramValues.append(",");
                }
            }

            sb.append("public " + m.getReturnType().getName() + " " + m.getName() + "(" + paramNames.toString() + ") {\r\n");
            sb.append("try{\r\n");
            sb.append("Method m = " + interfaces[0].getName() + ".class.getMethod(\"" + m.getName() + "\",new Class[]{" + paramClasses.toString() + "});\r\n");
            sb.append("this.h.invoke(this,m,null);\r\n");
            sb.append("return;\r\n");
            sb.append("}catch(Error _ex) { }");
            sb.append("catch(Throwable e){\r\n");
            sb.append("throw new UndeclaredThrowableException(e);\r\n");
            sb.append("}");
            //sb.append(getReturnEmptyCode(m.getReturnType()));
            sb.append("}");
        }
        sb.append("}\r\n");
        return sb.toString();
    }


    private static Map<Class,Class> mappings = new HashMap<Class, Class>();
    static {
        mappings.put(int.class,Integer.class);
    }

    private static String getReturnEmptyCode(Class<?> returnClass){
        if(mappings.containsKey(returnClass)){
            return "return 0;";
        }else if(returnClass == Void.class){
            return "";
        }else {
            return "return null;";
        }
    }

    private static String getCaseCode(String code,Class<?> returnClass){
        if(mappings.containsKey(returnClass)){
            return "((" + mappings.get(returnClass).getName() +  ")" + code + ")." + returnClass.getSimpleName() + "Value()";
        }
        return code;
    }

    private static boolean hasReturn(Class<?> clazz){
        return clazz != Void.class;
    }

    private static String toLowerFirstCase(String src){
        char [] chars = src.toCharArray();
        chars[0] += 32;
        return String.valueOf(chars);
    }
}
