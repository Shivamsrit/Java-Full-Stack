package CH01CoreJava.CH05Constructor.Singleton.lazyIntialization;

public class Singleton {
    public static Singleton object;

    private Singleton() {

    }
    public static Singleton get(){
        if(object == null){
            object = new Singleton();
        }
        return object;
    }
}
