class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int maxpro=nums[0],minpro=nums[0],max=nums[0];
        for(int i=1;i<n;i++){
            int x=maxpro;
            maxpro=Math.max(nums[i],Math.max(nums[i]*maxpro,nums[i]*minpro));
            max=Math.max(max,maxpro);
            System.out.print(max+" ");
            minpro=Math.min(nums[i],Math.min(nums[i]*x,nums[i]*minpro));
        }
        /* 2d dp
        int[][] dp=new int[2][n];
        dp[0][0]=nums[0];
        dp[1][0]=nums[0];
        int max=dp[0][0]/*Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            dp[0][i]=Math.max(nums[i],Math.max(nums[i]*dp[0][i-1],nums[i]*dp[1][i-1]));
            max=Math.max(max,dp[0][i]);
            System.out.print(max+" ");
            dp[1][i]=Math.min(nums[i],Math.min(nums[i]*dp[0][i-1],nums[i]*dp[1][i-1]));
        }*/
        return max;
    }
}