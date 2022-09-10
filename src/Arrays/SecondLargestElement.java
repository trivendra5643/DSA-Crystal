package Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] nums = {12, 7, 3, 13, 11, 5};
        System.out.println(secondLargestIn1Traverse(nums));
    }
    static int secondLargestIn1Traverse(int[] nums) {
        int largest = 0;
        int secLargest = -1;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > nums[largest]) {
                secLargest = largest;
                largest = i;
            }else if(nums[i] < nums[largest]){
                if(secLargest == -1) secLargest = i;
                if(nums[i] > nums[secLargest]) {
                    secLargest = i;
                }
            }
        }
        return secLargest;
    }
}
