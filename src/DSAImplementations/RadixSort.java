package DSAImplementations;

public class RadixSort {
    public static void main(String[] args) {
        int[] arr = {7, 1, 3, 11, 2, 7, 9, 6, 2, 1, 9, 6};
        radixSortFun(arr);
        for(int num: arr) System.out.print(num + " ");
    }

    public static void radixSortFun(int[] nums) {
        int max = nums[0];
        for(int i = 1; i < nums.length; i++) max = Math.max(nums[i], max);
        for(int place = 1; max / place > 0; place *= 10) {
            countingSort(nums, place);
        }
    }

    private static void countingSort(int[] nums, int place) {
        int[] values = new int[10], res = new int[nums.length];
        for(int i = 0; i < nums.length; i++) values[(nums[i] / place) % 10]++;
        for(int i = 1; i < 10; i++) values[i] += values[i - 1];
        for(int i = nums.length - 1; i >= 0; i--) {
            res[values[(nums[i] / place) % 10] - 1] = nums[i];
            values[((nums[i] / place) % 10)]--;
        }
        for(int i = 0; i < nums.length; i++) nums[i] = res[i];
    }
}
