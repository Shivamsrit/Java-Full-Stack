package CH02method;

import java.util.*;

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HCF obj = new HCF();
        obj.hcf(sc.nextInt(), sc.nextInt());


    }

    void hcf(int a, int b) {
        if (a == b) {
            System.out.println("hcf is = " + a);
            return;
        }
        if (a > b) hcf((a - b), b);
        if (b > a) hcf(a, (b - a));

    }

}
