package CH01CoreJava.CH15GenericClasses;


/*
        Method reference(::) and Constructor Reference(::)
       =====================================================
       :: --> Scope resolution operator

       Syntax for Method Reference
       ===========================
        1. Static Method Reference
                    Class Name :: Method Name
        2. Instance Method Reference
                    Object :: Method Name

 */
/*
   Interface Runnable{
            void run();
   }
 */
interface inter{
    void print(int i);
}

public class CH05MethodReference {
    public static void m1(){
        for(int i =0 ; i< 10 ; i++){
            System.out.println("child thread Created");
        }
    }
    public  void Print(int i){
        // Method Reference
        System.out.println("Method binded by object reference");
    }
    public static void main(String[] args) throws InterruptedException{

 //  Using Method Reference binded the method call run() of Interface Runnable.
        Runnable r = CH05MethodReference::m1;

        Thread t = new Thread(r);
        t.start();

        inter i1 = x -> System.out.println("By lambda expression");

        inter i2 = new CH05MethodReference()::Print;

        i1.print(10);
        i2.print(10);

        for(int i = 0; i < 10; i++){
            System.out.println("Main Thread Created");
            Thread.sleep(2000);
        }
    }

}
