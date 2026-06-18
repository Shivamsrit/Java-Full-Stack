package CH01CoreJava.CH13MultiThreading;

public class Main {
    public static void main(String[] args) {
        task t = new task();
        Thread t1 = new Thread(t);
        t1.start();
        String name = Thread.currentThread().getName();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread: " + i + " " + name);
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Main Thread interrupted"+e.getMessage());
            }
        }
        System.out.println("Main Thread finished " +name);

    }
}
