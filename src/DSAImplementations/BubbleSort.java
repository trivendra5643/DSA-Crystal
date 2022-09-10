package DSAImplementations;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 4, 3, 7, 6};
        bubbleSortFun(arr);
        for(int num: arr) System.out.print(num + " ");
    }

    static void bubbleSortFun(int[] arr) {
        for(int j = 0; j < arr.length - 1; j++) {
            boolean swapped = false;
            for(int i = 0; i < arr.length - j - 1; i++) {
                if(arr[i] > arr[i + 1]) {
                    swapped = true;
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            if(!swapped) break;
        }
    }
}
