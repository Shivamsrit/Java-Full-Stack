package CH01CoreJava.CH13MultiThreading.Test4;

public class Deadlock {
    public static void main(String[] args)throws InterruptedException {
        System.out.println("");
        Thread.currentThread().join();
    }
}
