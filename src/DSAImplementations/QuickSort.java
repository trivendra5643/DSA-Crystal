package DSAImplementations;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {3, 11, 5, 7, 9, 11, 1};
//        int[] arr = {12, 10, 5, 9};
//        int[] arr = {3, 3, 3, 3, 3};
        quickSortFunUsingHoarePartition(arr, 0, arr.length - 1);
//        quickSortFunUsingLomutoPartition(arr, 0, arr.length - 1);
//        quickSortFunUsingNaivePartition(arr, 0, arr.length - 1);
        for(int num: arr) System.out.print(num + " ");
    }
    static void quickSortFunUsingNaivePartition(int[] arr, int low, int high) {
        if(low < high) {
            int pivot = naivePartition(arr, low, high);
            quickSortFunUsingNaivePartition(arr, low, pivot - 1);
            quickSortFunUsingNaivePartition(arr, pivot + 1, high);
        }
    }
    static void quickSortFunUsingNaivePartitionV2(int[] arr, int low, int high) {
        if(low < high) {
            int pivot = naivePartitionRev(arr, low, high, low);
            quickSortFunUsingNaivePartitionV2(arr, low, pivot - 1);
            quickSortFunUsingNaivePartitionV2(arr, pivot + 1, high);
        }
    }

    static void quickSortFunUsingLomutoPartition(int[] arr, int low, int high) {
        if(low < high) {
            int pivot = lomutoPartitionRev(arr, low, high);
            quickSortFunUsingLomutoPartition(arr, low, pivot - 1);
            quickSortFunUsingLomutoPartition(arr, pivot + 1, high);
        }
    }

    static void quickSortFunUsingHoarePartition(int[] arr, int low, int high) {
        if(low < high) {
            int pivot = hoarePartitionRev(arr, low, high);
            quickSortFunUsingHoarePartition(arr, low, pivot);
            quickSortFunUsingHoarePartition(arr, pivot + 1, high);
        }
    }

    static int naivePartition(int[] arr, int low, int high) {
        int pivot = high;
        int[] temp = new int[high - low + 1];
        int index = 0;
        for(int i = low; i <= high; i++) {
            if(arr[i] <= arr[pivot]) temp[index++] = arr[i];
        }
        int ans = index - 1;
        for(int i = low; i <= high; i++) {
            if(arr[i] > arr[pivot]) temp[index++] = arr[i];
        }
        index = 0;
        for(int i = low; i <= high; i++) {
            arr[i] = temp[index++];
        }
        return ans;
    }

    static int lomutoPartition(int[] arr, int low, int high) {
        int index = low;
        for(int i = low; i < high; i++) {
            if(arr[i] < arr[high]) {
                swap(arr, index, i);
                index++;
            }
        }
        swap(arr, index, high);
        return index;
    }

    static int hoarePartition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int start = low - 1;
        int end = high + 1;
        while(true) {
            do {
                start++;
            }while(arr[start] < pivot);
            do{
                end--;
            }while(arr[end] > pivot);
            if(start >= end) return end;
            swap(arr, start, end);
        }
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static int lomutoPartitionRev(int[] arr, int low, int high) {
        int pivot = high;
        int i = -1, j = 0;
        while(j < high) {
            if(arr[j] < arr[pivot]) {
                swap(arr, i + 1, j);
                i++;
            }
            j++;
        }
        swap(arr, i + 1, pivot);
        return i + 1;
    }
    static int hoarePartitionRev(int[] arr, int low, int high) {
        int pivot = low;
        int i = low - 1, j = high + 1;
        while(true) {
            do {
                i++;
            }while(arr[i] < arr[pivot]);
            do {
                j--;
            }while(arr[j] > arr[pivot]);
            if(i >= j) return j;
            swap(arr, i, j);
        }
    }
    static int naivePartitionRev(int[] arr, int low, int high, int pivot) {
        int[] temp = new int[high - low + 1];
        int ind = 0;
        for(int i = low; i <= high; i++) {
            if(arr[i] < arr[pivot]) temp[ind++] = arr[i];
        }
        int ans = ind;
        temp[ind++] = arr[pivot];
        for(int i = low; i <= high; i++) {
            if(arr[i] > arr[pivot]) temp[ind++] = arr[i];
        }
        for(int i = 0; i < temp.length; i++) {
            arr[i + low] = temp[i];
        }
        return ans;
    }
}
