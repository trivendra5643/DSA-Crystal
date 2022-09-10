package DynamicProgramming;

public class SubsetSumIsK {
    public static void main(String[] args) {
        int[] arr = {2, 5, 3};
        int sum = 5;
        int[][] dp = new int[arr.length + 1][sum + 1];
        for(int i = 0; i <= arr.length; i++) dp[i][0] = 1;
        for(int i = 1; i <= sum; i++) dp[0][i] = 0;
        for(int i = 1; i <= arr.length; i++) {
            for(int j = 1; j <= sum; j++) {
                if(j - arr[i - 1] >= 0) {
                    dp[i][j] = dp[i - 1][j - arr[i - 1]] + dp[i - 1][j];
                }else dp[i][j] = dp[i - 1][j];
            }
        }
        System.out.println(dp[arr.length][sum]);
//        System.out.println(helper(arr, arr.length, sum));
    }

//    static int helper(int[] arr, int index, int sum) {
//        if(sum == 0) return 1;
//        if(sum < 0 || index == 0) return 0;
//        return helper(arr, index - 1, sum - arr[index - 1]) + helper(arr, index - 1, sum);
//    }

}
