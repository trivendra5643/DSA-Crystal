package DSAImplementations;

public class CountingSort {
    public static void main(String[] args) {
        int[] arr = {7, 1, 3, 11, 2, 7, 9, 6, 2, 1, 9, 6};
        countingSortFun(arr, 1, 11, 12);
        for(int num: arr) System.out.print(num + " ");
    }

    public static void countingSortFun(int[] nums, int min, int max, int n) {

        int[] range = new int[max - min + 1];
        for(int i = 0; i < n; i++) range[nums[i] - min]++;
        for(int i = 1; i < range.length; i++) {
            range[i] += range[i - 1];
        }
        int[] res = new int[n];
        for(int i = n - 1; i >= 0; i--) {
            res[range[nums[i] - min] - 1] = nums[i];
            range[nums[i] - min]--;
        }
        for(int i = 0; i < n; i++) nums[i] = res[i];
    }

}
