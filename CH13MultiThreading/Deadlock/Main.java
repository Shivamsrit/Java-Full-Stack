package CH13MultiThreading.Deadlock;

/*  1. If two Thread are waiting for each other forever (without end) Such type of suituation is called dead Lock.
    2. There is No resolution technique for deadlock but serval prevention (avoiding) Technique are possible .
    3. Synchronized Keyword is the came for deadLock hence Whenever we are using  Synchronized keyword we have to take special care.
 */

public class Main extends Thread {
    A a = new A();
    B b = new B();

    public void m1(){
        this.start();
        b.d2(a);  // Inside a Main Thread
    }
    @Override
    public void run(){
        a.d1(b);  // Inside a Child Thread
    }


    public static void main(String[] args)  {
        Main obj = new Main();
        obj.m1();
    }
}
