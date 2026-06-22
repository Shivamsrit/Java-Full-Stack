package CH01CoreJava.CH06Polymorphism;

public class main {

    public static void main(String[] args) {
        B obj1 = new A();   //upcasting
        obj1.get();
       // System.out.println(obj1.s1); // * gives error

        A obj2 = (A)obj1;
        System.out.println(obj2.s1); // Down casting
        System.out.println(((A)obj1).s1); // Down casting
    }
}
