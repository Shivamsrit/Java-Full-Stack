package CH01CoreJava.CH15GenericClasses;


// 2. custom created Generic class

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
 class Test<T extends Number>{              // Number --> interface
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

public class CH01GenricsPart2 {
    public static void main(String[] args) {
        Gen t = new Gen<>("pankaj");
        t.show();
        System.out.println("! 1st Generic class"+t.getObj());


        Test <Integer> obj = new Test<Integer>(10);
        obj.show();
        System.out.println("! 2st Generic class"+obj.getObj());
    }
}
