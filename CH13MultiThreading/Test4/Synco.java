package CH13MultiThreading.Test4;
// Solve problem data Inconsistency.

//   Synchronized => At a Time only one Thread working or Lock the Thread When His job is not done
class Display{
    public synchronized void wish(String name){
        for (int i = 0; i<5;i++ ){
            System.out.print("Good Morning : ");
            try{
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(" "+ name);
        }
    }
}
class MyThread extends Thread{
    Display d;
    String name;
    MyThread(Display d, String name){
        this.d = d;
        this.name =  name;

    }
    @Override
    public void run(){
        d.wish(name);

    }
}
public class Synco  {

    public static void main(String[] args) {
//        Display d = new Display();
//        case1: Synchronized work only if two thred work only same object
//        MyThread ob1 = new MyThread(d,"Sahin");
//        MyThread ob2 = new MyThread(d,"Dhoni");
//        ob1.start();
//        ob2.start();
 //        case 2 : if not synchronized not work
        Display d1 = new Display();
        Display d2 = new Display();
        MyThread ob1 = new MyThread(d1,"Sahin");
        MyThread ob2 = new MyThread(d2,"Dhoni");

    }

}
