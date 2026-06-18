package CH01CoreJava.CH10LambdaExpression;

public class Main {
    public static void main(String[] args) {
//        Say ob1 = (name) -> name;
//        System.out.println(ob1.print("Hello Bhaiya"));

//        var -> it automatically detect datatype
//        Addition ob2 = (a,b)->  a+b;
//        System.out.println(ob2.add(10,20));

//        Say ob1 = (a) ->{
//            if(a%2==0) return "Even Number";
//            return "Odd Number";
//        };
//
//        System.out.println(ob1.evenOdd(11));


        // find square
        Say ob1 = (a ) -> a*a;
        System.out.println(ob1.Square(10));


        // length of string

        //convert uppercase
        //check String specific letter of no.

    }
}
