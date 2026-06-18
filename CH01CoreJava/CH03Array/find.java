package CH01CoreJava.CH03Array;

public class find {
    public static void main(String[] args) {
        int[] arr = {4, 8, 12, 15, 7, 9};

        boolean flag = true;
        int target = 7;
        for (int i=0; i < arr.length; i++) {
            if (target == arr[i]) {
                System.out.println("target found index=" + i);
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("not found");
        }

    }
}