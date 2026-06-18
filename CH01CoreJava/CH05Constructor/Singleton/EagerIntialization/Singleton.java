package CH01CoreJava.CH05Constructor.Singleton.EagerIntialization;

public class Singleton {
    public static Singleton object = new Singleton();

    private Singleton() {

    }
    public static Singleton get(){
        return object;
    }
}
