package example.Pattern.ProxyPattern.staticProxy;

public class ServiceProxy implements Service{

    private final Service service;

    public ServiceProxy(Service service){
        this.service = service;
    }

    @Override
    public void send(String msg) {
        System.out.println("before!");
        service.send(msg);
        System.out.println("after!");
    }
}
