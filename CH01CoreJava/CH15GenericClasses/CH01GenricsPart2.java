package CH01CoreJava.CH15GenericClasses;


// 2. custom created Generic class

import java.util.ArrayList;

class Gen <T>{
    T obj;

    // parameterized constructor
    Gen(T obj){
        this.obj = obj;
    }
    public void show(){
        System.out.println("The type od object :: "+ obj.getClass().getName());
    }

    public T getObj() {
        return obj;
    }
}

// 2. Fix with Generic Class accept only specific type
            // * X --> If X is class type, either it will accept X type or its Child Type.
            // * X ---> if X is interface , we can pass either X or its implementation class.
 class Test<T extends Number>{              // Number --> Class
                T obj;

                // parameterized constructor
                Test(T obj){
                    this.obj = obj;
                }
                public void show(){
                    System.out.println("The type od object :: "+ obj.getClass().getName());
                }

                public T getObj() {
                    return obj;
                }
}
class Test1 <T extends Runnable> {      // Runnable --> Interface

}

// * class demo<X,Y>{                //it allows

//    }


/*
            class test<t extends Number&Runnable> // valid
            class test<t extends Number&Runnable&Comparable> // valid
            class test<t extends Number&String> // Invalid because we can,t extend more than one class at a time
            class test<t extends Comparable&Runnable> // Invalid
            class test<t extends Runnable&Number> // Invalid

Generic class
=============
        Normal class = Type Parameter

        can you apply type parameter at method level
        Ans:- yes, it is possible

 */
public class CH01GenricsPart2 {
    public static void main(String[] args) {
        Gen t = new Gen<>("pankaj");
        t.show();
        System.out.println("! 1st Generic class"+t.getObj());


        Test <Integer> obj = new Test<Integer>(10);
        obj.show();
        System.out.println("! 2st Generic class"+obj.getObj());


        ArrayList<Integer> li = new ArrayList<>();
        li.add(20);
        li.add(40);
        li.add(89);
        ;;
        ;;

        CH01GenricsPart2 ch = new CH01GenricsPart2();
        ch.m1(li);
    }

//    Generic Method And wild card Character pattern(?)
//  =================================================
    public void m1(ArrayList< ? > li){

    }

//          There will be 4 test cases
/*    ===================================

            1. m1(Arraylist<String> li)
            2. m1(Arraylist<?> li)
                 * This method only applicable for ArrayList of any Type.
                 * This method signature is best suited only we perform read operation on Arraylist.
                 * This method we can,t add anything to the list expected null.
            3. m1(Arraylist< ? extends X > li)   *
            4. m1(Arraylist< ? Super x> li)
                * X--> class , we can make a call to method by passing ArrayList of X Type and its super class.
                * X--> interface , we can make a call to method by passing ArrayList of X type or its super class of implementation class of X.
                


 */
}
