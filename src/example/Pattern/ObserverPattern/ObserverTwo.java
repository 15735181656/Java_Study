package example.Pattern.ObserverPattern;

public class ObserverTwo extends Observer{

    public ObserverTwo(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("this is observer two");
    }
}
