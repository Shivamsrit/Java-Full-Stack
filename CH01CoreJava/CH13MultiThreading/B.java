package CH01CoreJava.CH13MultiThreading;

public class B implements Runnable{
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        for(int i=0;i<10;i++){
            System.out.println("B Thread#: " + i + " " + name);
            try {
                Thread.sleep(1000);
            }catch(InterruptedException e) {
                System.out.println("B Thread interrupted"+e.getMessage());
            }
        }
        System.out.println("B Thread finished"+name);
    }
}
