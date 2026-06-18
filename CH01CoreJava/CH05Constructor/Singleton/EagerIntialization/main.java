package CH01CoreJava.CH05Constructor.Singleton.EagerIntialization;

public class main {
    public static void main(String[] args) {
        Singleton ob1 = Singleton.get();
        Singleton ob2 = Singleton.get();


        System.out.println(ob1);
        System.out.println(ob2);
    }
}
