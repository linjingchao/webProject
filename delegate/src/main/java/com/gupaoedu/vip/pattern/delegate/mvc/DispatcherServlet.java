package com.gupaoedu.vip.pattern.delegate.mvc;

import com.gupaoedu.vip.pattern.delegate.controllers.MemberController;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class DispatcherServlet extends HttpServlet {

    private List<Handler> handlerMapping = new ArrayList<Handler>();

    @Override
    public void init(){
        try {

            Class<?> clazz = MemberController.class;
            Handler handler = new Handler();
            handler.setController(clazz.newInstance());
            handler.setMethod(clazz.getMethod("",new Class[]{String.class}));
            handler.setUrl("/web/getMemberById.do/");
            handlerMapping.add(handler);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

//    private void doDispatch(HttpServletRequest request, HttpServletResponse response) throws Exception{
//        //获取URL地址
//        String uri =request.getRequestURI();
//
//        String mid = request.getParameter("mid");
//
//
//    }


    protected void service(HttpServletRequest servletRequest,HttpServletResponse response){
        doDispatch(servletRequest,response);
    }

    private void doDispatch(HttpServletRequest request, HttpServletResponse response){
        //获取url地址
        String uri = request.getRequestURI();

        Handler handler = null;

        //去handlerMapping里匹配
        for(Handler h : handlerMapping){
            if(uri.contains(h.getUrl())){
                handler = h;
                break;
            }
        }

        Object object = null;
        try{
            object = handler.getMethod().invoke(handler.getController(),request.getParameter("mid"));
        }catch (Exception e){
            e.printStackTrace();
        }


    }

    class Handler{
        private Object controller;
        private Method method;
        private String url;

        public Object getController() {
            return controller;
        }

        public Handler setController(Object controller) {
            this.controller = controller;
            return this;
        }

        public Method getMethod() {
            return method;
        }

        public Method setMethod(Method method) {
           return method;
        }

        public String getUrl() {
            return url;
        }

        public String setUrl(String url) {
           return url;
        }
    }
}
