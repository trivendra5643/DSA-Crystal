package Arrays;

public class TrappingRainwater {
    public int trap(int[] height) {
        int leftMax = height[0];
        int rightMax = height[height.length - 1];
        int res = 0;
        int[] leftMaxHeight = new int[height.length];
        int[] rightMaxHeight = new int[height.length];
        for(int i = 0; i < height.length; i++) {
            leftMaxHeight[i] = Math.max(leftMax, height[i]);
            if(height[i] > leftMax) leftMax = height[i];
        }
        for(int i = height.length - 1; i >= 0; i--) {
            rightMaxHeight[i] = Math.max(rightMax, height[i]);
            if(height[i] > rightMax) rightMax = height[i];
        }
        for(int i = 0; i < height.length; i++) {
            int ans = Math.min(rightMaxHeight[i], leftMaxHeight[i]) - height[i];
            if(ans > 0) res += ans;
        }
        return res;
    }
}
