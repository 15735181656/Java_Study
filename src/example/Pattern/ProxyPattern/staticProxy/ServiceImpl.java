package example.Pattern.ProxyPattern.staticProxy;

public class ServiceImpl implements Service{
    @Override
    public void send(String msg) {
        System.out.println("success send : " + msg);
    }
}
