package DSAImplementations;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 4, 3, 7, 6};
        selectionSortFun(arr);
        for(int num: arr) System.out.print(num + " ");
    }

    static void selectionSortFun(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            int ind = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[ind]) {
                    ind = j;
                }
            }
            if(ind != i) {
                int temp = arr[i];
                arr[i] = arr[ind];
                arr[ind] = temp;
            }
        }
    }
}
