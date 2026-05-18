package DSA.Sorting;

public class SortingAlgos {
    public static void main(String[] args) {
        System.out.println("hello");
        SortingAlgos ob1 = new SortingAlgos();
        int []arr = {2,5,3,8,9,9,10};
        ob1.bubbleSort( arr, 5);
    }

    void bubbleSort(int[] arr, int n) {
        int i = 0, j = 0, flag = 0;
        for (i = n - 1; i <= 0; i--) {
            flag=0;
            for (j = 0; j < i; i++) {
                if(arr[j] > arr[j+1]) {
                    flag = 1;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if(flag == 0) break;
        }


    }
}
