package DSAImplementations;

import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {
    static int weDo = 16;
    public static void main(String[] args) {
//        int[] arr = {30, 40, 10, 80, 5, 12, 70};
//        bucketSortFun(arr, 4);
//        for(int num: arr) System.out.print(num + " ");
        myFun();
        System.out.println(weDo);
    }

    public static void myFun() {
        System.out.println(weDo);
    }

    public static void bucketSortFun(int[] nums, int k) {
        int max = nums[0];
        for(int i = 1; i < nums.length; i++) max = Math.max(max, nums[i]);
        max++;
        ArrayList<ArrayList<Integer>> buckets = new ArrayList<>();
        for(int i = 0; i < k; i++) {
            buckets.add(new ArrayList<Integer>());
        }
        for(int i = 0; i < nums.length; i++) {
            buckets.get((nums[i] * k) / max).add(nums[i]);
        }
        for(int i = 0; i < k; i++) {
            Collections.sort(buckets.get(i));
        }
        int ind = 0;
        for(int i = 0; i < k; i++) {
            for(int j = 0; j < buckets.get(i).size(); j++) {
                nums[ind++] = buckets.get(i).get(j);
            }
        }
    }
}
