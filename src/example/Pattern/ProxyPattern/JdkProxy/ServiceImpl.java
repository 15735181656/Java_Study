package example.Pattern.ProxyPattern.JdkProxy;

public class ServiceImpl implements Service {
    @Override
    public void send(String msg) {
        System.out.println("success send : " + msg);
    }

    @Override
    public void accept(String msg) {
        System.out.println("success accept : " + msg);
    }
}
