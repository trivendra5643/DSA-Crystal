package BinarySearch;

public class count1InSortedBinArray {
    public static void main(String[] args) {
        int[] arr = {0};
        if(arr.length == 0) System.out.println(0);
        if(arr[0] == 1) {
            System.out.println(arr.length);
        }else if(arr[arr.length - 1] == 0) {
            System.out.println(0);
        }else {
            int low = 0;
            int high = arr.length - 1;
            while(low <= high) {
                if(high < low) break;
                int mid = low + ((high - low) / 2);
                if(arr[mid] == 1) {
                    if(arr[mid - 1] == 0) {
                        System.out.println(arr.length - mid);
                        break;
                    }else high = mid - 1;
                }else low = mid + 1;
            }
        }
    }
}
