package Arrays;

public class MinGroupFlips {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 0, 0, 1, 1, 0};
        int start = -1;
        int end = 1;
        while(end < nums.length) {
            if(nums[end] != nums[0] && start == -1) {
                start = end;
            }
            if(nums[end] == nums[0] && start != -1) {
                System.out.println("from " + start + " to " + (end - 1));
                start = -1;
            }
            if(end == nums.length - 1 && start != -1) System.out.println("from " + start + " to " + end);
            end++;
        }
//        int oneCount = 0;
//        int zeroCount = 0;
//        if(nums[0] == 0) {
//            zeroCount++;
//        }else oneCount++;
//        for(int i = 1; i < nums.length; i++) {
//            if(nums[i] != nums[i - 1]) {
//                if(nums[i] == 0) {
//                    zeroCount++;
//                }else oneCount++;
//            }
//        }
//        if(zeroCount == 0 || oneCount == 0) return;
//        if(zeroCount < oneCount) {
//            int start = -1; int end = 0;
//            while(end < nums.length) {
//                if(nums[end] == 0 && start == -1) {
//                    start = end;
//                }
//                if(nums[end] == 1 && start != -1) {
//                    System.out.println("from " + start + " to " + (end - 1));
//                    start = -1;
//                }
//                if(end == nums.length - 1 && start != -1) System.out.println("from " + start + " to " + end);
//                end++;
//            }
//        }else {
//            int start = -1; int end = 0;
//            while(end < nums.length) {
//                if(nums[end] == 1 && start == -1) {
//                    start = end;
//                }
//                if(nums[end] == 0 && start != -1) {
//                    System.out.println("from " + start + " to " + (end - 1));
//                    start = -1;
//                }
//                if(end == nums.length - 1 && start != -1) System.out.println("from " + start + " to " + end);
//                end++;
//            }
//        }
    }
}
