public class largest {
    public static void main(String[] args) {
        int[] num = {23, 34, 40, 20, 74};
        int small = 0;
        int large = 0;
        int i = 0;
        int j = 4;
        while (i < j) {
            if (num[i] < num[j]) {
                small = num[i];
                j--;
            } else {
                small = num[j];
                i++;
            }
            if (num[i] > num[j]) {
                large = num[i];
                j--;
            } else {
                large = num[j];
                i++;
            }

        }

        System.out.println(large);
    }
}