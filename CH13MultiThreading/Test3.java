package CH13MultiThreading;

/*
     public Static final MIN_PRIORITY = 1;
     public Static final NORM_PRIORITY = 5;
     public Static final MAX_PRIORITY = 10;

     More the priority quickly thread Schedular allocate the CPU time.


 */
// child Thread created by the main Thread, so Priority of "Main Thread" will be shared as a priority for "ChildThread".
class ChildThread extends Thread{
    @Override
    public void run(){

        System.out.println("child Thread "+ Thread.currentThread().getPriority());
        for(int i = 0 ; i < 10 ; i++){
            System.out.println("Child Thread "+ Thread.currentThread().getName());
            Thread.yield();
            /* there is possiblity of main thread getting more no. of times ,
            so main thread execution is faster than the child Thread will get chance.  */

        }
    }

}
// JVM will Create Main thread And set default priority "5".
public class Test3 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main Thread "+ Thread.currentThread().getPriority());
        ChildThread t = new ChildThread();
        t.setPriority(7);
        t.start();
        for (int i =0 ; i<10;i++){

            System.out.println("main thread"+Thread.currentThread().getName());
        }
    }
}
