package DSAProblems;

public class find1InSortedBinary {
    public static void main(String[] args) {
        int[] arr = {1};
        System.out.println(countTotal1(arr));
    }
    private static int countTotal1(int[] arr) {
        if(arr[0] == 1) return arr.length;
        if(arr[arr.length - 1] == 0) return 0;
        int low = 0;
        int high = arr.length - 1;
        while(low <= high) {
            int mid = low + ((high - low) / 2);
            if (arr[mid] == 1) {
                if (mid == 0 || arr[mid - 1] == 0) {
                    return arr.length - mid;
                } else high = mid - 1;
            } else low = mid + 1;
        }
        return -1;
    }
}
