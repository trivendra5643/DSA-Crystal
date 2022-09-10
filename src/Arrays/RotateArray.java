package Arrays;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        rotateRight(nums, k);
        for(int num: nums) System.out.print(num + " ");
    }
    static void rotateLeft(int[] nums, int k) {
        if(k == nums.length || nums.length == 1) return;
        if(k > nums.length) k %= nums.length;
        int[] temp = new int[k];
        int index = 0;
        for(int i = 0; i < k; i++) {
            temp[i] = nums[i];
        }
        for(int i = k; i < nums.length; i++) {
            nums[index++] = nums[i];
        }
        for(int i = 0; i < k; i++) {
            nums[index++] = temp[i];
        }
    }
    static void rotateRight(int[] nums, int k) {
        if(k == nums.length || nums.length == 1) return;
        if(k > nums.length) k %= nums.length;
        int[] temp = new int[k];
        int index = 0;
        for(int i = nums.length - k; i < nums.length; i++) {
            temp[index++] = nums[i];
        }
        for(int i = nums.length - 1; i >= k; i--) {
            nums[i] = nums[i - k];
        }
        for(int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }
    }
//    static void optimisedRotate(int[] nums, int k) {
//        reverse(nums, 0, k - 1);
//        reverse(nums, k, nums.length - 1);
//        reverse(nums, 0, nums.length - 1);
//    }
}
