package DSAImplementations;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {3, 11, 5, 7, 9, 11, 1};
        mergeSortFun(arr, 0, arr.length - 1);
        for(int num: arr) System.out.print(num + " ");
    }

    static void mergeSortFun(int[] arr, int low, int high) {
        if(high > low) {
            int mid = low + ((high - low) / 2);
            mergeSortFun(arr, low, mid);
            mergeSortFun(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    static void merge(int[] arr, int low, int mid, int high) {
        int[] left = new int[mid - low + 1];
        int z = 0;
        for(int i = low; i <= mid; i++) left[z++] = arr[i];
        int[] right = new int[high - mid];
        z = 0;
        for(int i = mid + 1; i <= high; i++) right[z++] = arr[i];
        z = low;
        int x = 0; int y = 0;
        while(x < left.length && y < right.length) {
            if(left[x] <= right[y]) {
                arr[z++] = left[x++];
            }else arr[z++] = right[y++];
        }
        while(x < left.length) {
            arr[z++] = left[x++];
        }
        while(y < right.length) {
            arr[z++] = right[y++];
        }
    }
}
