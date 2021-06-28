package example.Pattern.ObserverPattern;

public class ObserverDemo {

    public static void main(String[] args) {

        Subject subject = new Subject();

        new ObserverOne(subject);
        new ObserverTwo(subject);

        subject.setState(1);
    }
}
