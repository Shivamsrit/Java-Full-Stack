package CH13MultiThreading.DeamonThread;
/*
Daemon Thread ek background thread hota hai jo JVM ke liye supporting/helper kaam karta hai.
                                    Jab saare non-daemon (user) threads khatam ho jaate hain,
                                    JVM automatically saare daemon threads ko band kar deta hai —
                                    chahe unka kaam complete hua ho ya nahi.
 */

class MyThread extends Thread{
    @Override
    public void run(){
        for( int i = 0; i < 10; i++) {
            System.out.println("child Thread Created ");
        }
    }
}

public class Test {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().isDaemon());

        MyThread t1 = new MyThread();
        t1.setDaemon(true);
        t1.start(); //

        // 2 Thread ==> MainThread( Non- DaemonThread(Hero)), Thread-0(Daemon Thread ( MakeUpMan ))
    }
}
