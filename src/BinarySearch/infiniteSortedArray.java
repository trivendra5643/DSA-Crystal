package BinarySearch;

public class infiniteSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(findElement(3, arr));
    }
    static int findElement(int k, int[] arr) {
        if(arr[0] == k) return 0;
        int high = 1;
        while(arr[high] < k) high *= 2;
        if(arr[high] == k) return high;
        int low = (high / 2) + 1;
        high -= 1;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(arr[mid] == k) {
                return mid;
            }else if(arr[mid] < k) {
                low = mid + 1;
            }else high = mid - 1;
        }
        return -1;
    }
}
