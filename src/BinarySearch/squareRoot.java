package BinarySearch;

public class squareRoot {
    public static void main(String[] args) {
        System.out.println(squareRootByBinarySearch(17));
    }
    static int squareRootByBinarySearch(int x) {
        if(x == 0) return 0;
        int ans = -1;
        int low = 1;
        int high = x;
        while(low <= high) {
            int mid = low + ((high - low) / 2);
            if(mid * mid == x) {
                ans = mid;
            }else if(mid * mid < x) {
                low = mid + 1;
                ans = mid;
            }else  {
                high = mid - 1;
            }
        }
        return ans;
    }
}
