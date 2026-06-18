package CH01CoreJava.CH03Array;

public class print {
    public static void main(String[] args) {
        int[][] arr = {{2, 9}, {1, 5}, {3, 7}, {6, 2}, {0, 8}};
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}