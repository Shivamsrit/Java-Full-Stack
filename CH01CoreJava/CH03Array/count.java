package CH01CoreJava.CH03Array;

public class count {
    public static void main(String[] args) {
        int[] num = {4, 5, 12, 5, 7, 5, 6};
        int ele = 5;
        int count = 0;
        for (int z = 0; z < 7; z++) {
            if (ele == num[z]) count++;
        }
        System.out.println("occurance = " + count);
    }
}