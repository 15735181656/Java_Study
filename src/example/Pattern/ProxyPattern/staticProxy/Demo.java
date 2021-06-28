package example.Pattern.ProxyPattern.staticProxy;

public class Demo {

    public static void main(String[] args) {

        Service service = new ServiceImpl();

        ServiceProxy serviceProxy = new ServiceProxy(service);

        serviceProxy.send("ok");
    }
}
