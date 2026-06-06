package CH13MultiThreading.Test4;

class ChildThread extends Thread{
    @Override
    public void run(){
        System.out.println("Child Thread "+ Thread.currentThread().getName());
        for (int i = 0 ;i < 10 ;i++){
            System.out.println("Rama Thread");
            try {
                Thread.sleep(2000);//Pause The Execution for 2 Sec
            }
            catch (InterruptedException ex){
                System.out.println("hello sirji");
            }
        }
    }
}

public class Test4 {
    public static void main(String[] args) throws InterruptedException {
        ChildThread t1 = new ChildThread();
        t1.start();
        t1.join(1000); //Main Thread waiting for Child Thread

        for (int i = 0 ; i < 10 ; i++){
            System.out.println("Sita Thread");
        }
    }
}
