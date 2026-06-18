package CH01CoreJava.CH13MultiThreading.InnerThreadComunication;


class MyThread extends Thread{
    int total;

    @Override
    public void run(){
        synchronized (this){
            System.out.println("Child Thread Created");
            for( int i = 0; i < 10 ; i++){
                total += i;
            }
            System.out.println("Child Thread Gives Notification");
            this.notify();
        }
    }
}

public class Test {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("start");

        MyThread t1 = new MyThread();
        t1.start();
        Thread.sleep(10000); // got notification but he is a sleeping state .
        synchronized (t1) {

            t1.wait();
            System.out.println("Main Thread got notification");
            System.out.println(t1.total);
        }
    }
}
