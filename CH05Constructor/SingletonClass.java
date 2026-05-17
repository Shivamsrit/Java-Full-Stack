package Constructor;

// Singleton Design Pattern requirement
// * Static reference variable required same class
// * private Constructor
// * Public Static method returning object referenced , method may return null if object already created.


public class SingletonClass {
    private static SingletonClass ob1 = new SingletonClass() ;
    private static int flag=0;
    private SingletonClass(){

    }
    public static SingletonClass Object(){
        if(flag == 1){
            return null;
        }
        flag++;
        return ob1;
    }
}
