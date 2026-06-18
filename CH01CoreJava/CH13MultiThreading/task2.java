package CH01CoreJava.CH13MultiThreading;

class MyThread implements Runnable {
    @Override
    public void run() {
        Thread.currentThread().setName("Rahul");
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
        System.out.println("Mythread end");
    }
}

public class task2 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread t1 = new Thread(myThread);
        t1.start();
        Thread.currentThread().setName("Shivam");
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
        System.out.println("main thread end");
    }
}
