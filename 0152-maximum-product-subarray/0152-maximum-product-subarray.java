class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int[][] dp=new int[2][n];
        dp[0][0]=nums[0];
        dp[1][0]=nums[0];
        int max=dp[0][0]/*Integer.MIN_VALUE*/;
        for(int i=1;i<n;i++){
            dp[0][i]=Math.max(nums[i],Math.max(nums[i]*dp[0][i-1],nums[i]*dp[1][i-1]));
            max=Math.max(max,dp[0][i]);
            System.out.print(max+" ");
            dp[1][i]=Math.min(nums[i],Math.min(nums[i]*dp[0][i-1],nums[i]*dp[1][i-1]));
        }
        return max;
    }
}