package method;

import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Factorial obj = new Factorial();
        long fact = obj.factorial(sc.nextLong());
        System.out.println("output"+fact);
    }

    long factorial(long a) {
//        System.out.println(a);
        if (a <= 1) return 1;
        return a * factorial(a - 1);
    }
}
