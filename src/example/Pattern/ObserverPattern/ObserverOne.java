package example.Pattern.ObserverPattern;

public class ObserverOne extends Observer{

    public ObserverOne(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.printf("this is this observer one");
    }
}
