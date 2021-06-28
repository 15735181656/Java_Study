package example.Pattern.ProxyPattern.JdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class myInvocationHandler implements InvocationHandler {

    private final Object service;

    public myInvocationHandler(Object object){
        this.service = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("before!");
        Object o = method.invoke(service, args);
        System.out.println("after!");
        return o;
    }
}
