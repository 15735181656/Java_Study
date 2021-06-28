package example.Pattern.ProxyPattern.JdkProxy;

import java.lang.reflect.Proxy;

public class JdkProxyFactory {

    public static Object getProxy(Object o){
        return Proxy.newProxyInstance(
                o.getClass().getClassLoader(),
                o.getClass().getInterfaces(),
                new myInvocationHandler(o)
        );
    }
}
