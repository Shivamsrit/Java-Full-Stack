package CH01code_Snippt.assignment_1;

import java.util.*;

public class greater {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int no1 = sc.nextInt();
        int no2 = sc.nextInt();


        if (no1 > no2) {
            System.out.println("no1 is greater");
        } else if (no1 == no2) {
            System.out.println("both numbers are equals");
        } else {
            System.out.println("no2 is greater");
        }
        sc.close();
    }
}