package CH01CoreJava.CH13MultiThreading.Deadlock;

public class A {
    public synchronized void d1(B b){
        System.out.println("Thread 1 Starts execution d1"); // It have A lock()
        try {
            Thread.sleep(5000);
        }
        catch (InterruptedException ex ){
            ex.printStackTrace();
        }
        System.out.println("Thread 1 try to call B last method");
        b.last();   //waiting for B lock() realised by Thread -1
    }
    public synchronized void last(){            // Deadlock occur infinite waiting for release lock.
        System.out.println("Inside A Last Method");
    }
}
