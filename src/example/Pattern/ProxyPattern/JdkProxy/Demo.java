package example.Pattern.ProxyPattern.JdkProxy;

public class Demo {

    public static void main(String[] args) {
        Service service = (Service) JdkProxyFactory.getProxy(new ServiceImpl());

        service.send("jdk Proxy!");

        service.accept("jdk Proxy!");
    }
}
