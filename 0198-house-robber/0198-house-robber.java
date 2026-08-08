class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(nums==null || n==0) return 0;
        if(n==1) return nums[0];
        int[] dp=new int[n];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<n;i++){
            //take condition
            int x=dp[i-2]+nums[i];
            //skip condition
            int y=dp[i-1];
            dp[i]=Math.max(x,y);
        }
        return dp[n-1];
    }
}