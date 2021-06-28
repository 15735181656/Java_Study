package example.Pattern.SingletonPattern;


//懒汉式，延迟加载
//public class Singleton {
//
//    private static Singleton singleton;
//
//    private Singleton(){}
//
//    public static Singleton getInstance(){
//        if (singleton == null){
//            singleton = new Singleton();
//        }
//        return singleton;
//    }
//}

//饿汉式
//public class Singleton {
//    private static Singleton singleton = new Singleton();
//
//    private Singleton(){}
//
//    public static Singleton getInstance(){
//        return singleton;
//    }
//}

//双重检测
public class Singleton {
    private volatile static Singleton singleton;

    private Singleton(){}

    public static Singleton getInstance(){
        if (singleton == null){
            synchronized (Singleton.class){
                if (singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}