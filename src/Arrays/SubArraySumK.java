package Arrays;

public class SubArraySumK {
    public static void main(String[] args) {
        int[] arr = {1, 4, 0, 0, 3, 10, 5};
        System.out.println(findSubArr(arr, 7));
    }
    static boolean findSubArr(int[] arr, int k) {
        int sum = arr[0];
        int start = 0;
        for(int i = 1; i < arr.length; i++) {
            while(sum > k && start < i) sum -= arr[start++];
            if(sum == k) return true;
            sum += arr[i];
        }
        return sum == k;
    }
}
