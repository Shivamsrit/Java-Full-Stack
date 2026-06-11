package CH13MultiThreading.Deadlock;

public class B {

    public synchronized void d2(A a){
        System.out.println("Thread 2 Starts execution d2"); // it have B lock()
        try {
            Thread.sleep(5000);
        }
        catch (InterruptedException ex ){
            ex.printStackTrace();
        }
        System.out.println("Thread 2 try to call A last method");
        a.last();                   // waiting for A lock() realsed by Thread -1
    }
    public synchronized void last(){
        System.out.println("Inside B Last Method");
    }
}
