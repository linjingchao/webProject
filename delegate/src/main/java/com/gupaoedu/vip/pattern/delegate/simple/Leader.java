package com.gupaoedu.vip.pattern.delegate.simple;

import java.util.HashMap;
import java.util.Map;

public class Leader implements IEployee {

    private Map<String,IEployee> map = new HashMap<String, IEployee>();

    public Leader(){
        map.put("加密",new EmployyA());
        map.put("登陆",new EployeeB());
    }
    public void doing(String command) {
        map.get(command).doing(command);
    }
}
