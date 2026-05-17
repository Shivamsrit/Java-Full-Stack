package method;

import java.util.*;

public class Print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Print obj = new Print();
        obj.print(sc.nextInt());

    }

    void print(int a) {
        if (a <= 0) return;
        System.out.println("Hello");
        print(a - 1);
    }
}
