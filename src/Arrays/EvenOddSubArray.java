package Arrays;

public class EvenOddSubArray {
    public static void main(String[] args) {
        int[] nums = {7, 10, 13, 14};
//        Another Approach
        int ans = Integer.MIN_VALUE;
        int res = 1;
        for(int i = 1; i < nums.length; i++) {
            if((nums[i] + nums[i - 1]) % 2 != 0) {
                res++;
            }else {
                ans = Math.max(ans, res);
                res = 1;
            }
        }
        ans = Math.max(ans, res);
        System.out.println(ans);


//        boolean bool = isEven(nums[0]);
//        int pointer = 0;
//        int res = 1;
//        for(int i = 1; i < nums.length; i++) {
//            if(isEven(nums[i]) == bool) {
//                res = Math.max(res, i - pointer);
//                pointer = i;
//            }else if(i == nums.length - 1) res = Math.max(res, i - pointer + 1);
//            bool = isEven(nums[i]);
//        }
//        System.out.println(res);
    }

    static boolean isEven(int num) {
        return (num % 2 == 0);
    }
}
