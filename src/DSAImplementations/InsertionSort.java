package DSAImplementations;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 4, 3, 7, 6};
        insertionSortFun(arr);
        for(int num: arr) System.out.print(num + " ");
    }

    static void insertionSortFun(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            int num = arr[i];
            int ind = i - 1;
            while(arr[ind] > num && ind >= 0) {
                arr[ind + 1] = arr[ind];
                ind--;
            }
            arr[ind + 1] = num;
        }
    }
}
