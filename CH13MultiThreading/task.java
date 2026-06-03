package CH13MultiThreading;

public class task extends A implements Runnable {
    @Override
    public void run() {
        B obj = new B();
        Thread t = new Thread(obj);
        t.start();
        String name = Thread.currentThread().getName();
        for(int i = 0; i < 10; i++) {
            System.out.println("Task #" + i + " " + name);
            try {
                Thread.sleep(1000);
            }catch(InterruptedException e) {
                System.out.println("Main Thread interrupted"+e.getMessage());
            }
        }
        System.out.println("Task 1 finished" + name);
    }
}
