package CH13MultiThreading;

class ChildThread extends Thread{
    @Override
    public void run(){
        System.out.println("child Thread "+ Thread.currentThread().getPriority());
    }

}
// JVM will Create Main thread And set default priority "5".
public class Test3 {
    public static void main(String[] args) {
        System.out.println("Main Thread "+ Thread.currentThread().getPriority());
        ChildThread t = new ChildThread();
        t.start();
    }
}
