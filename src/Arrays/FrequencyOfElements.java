package Arrays;

public class FrequencyOfElements {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30};
        freqElement(nums);
    }

    static void freqElement(int[] nums) {
        if(nums.length == 1) System.out.println(nums[0] + " " + 1);
        int start = 0;
        int end = 1;
        while(end < nums.length) {
            if(nums[start] != nums[end]) {
                System.out.println(nums[start] + " " + (end - start));
                start = end;
            }
            if(end == nums.length - 1) {
                if(start == end) {
                    System.out.println(nums[start] + " " + 1);
                }else System.out.println(nums[start] + " " + (end - start + 1));
            }
            end++;
        }
    }

}
