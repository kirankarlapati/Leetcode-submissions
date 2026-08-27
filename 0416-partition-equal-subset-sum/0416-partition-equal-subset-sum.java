class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int x:nums) sum+=x;
        if(sum%2!=0) return false;
        int t=sum/2;
        int n=nums.length;
        boolean[][] dp=new boolean[n+1][t+1];
        dp[0][0]=true;
        for(int i=1;i<=n;i++){
            for(int j=0;j<=t;j++){
                // if(i==0) dp[i][j]=true;
                if(j>=nums[i-1]) dp[i][j]=dp[i-1][j] || dp[i-1][j-nums[i-1]];
                else dp[i][j]=dp[i-1][j];
                if(j==sum/2 && dp[i][j]==true) return true; 
            }
        }
        // return dp[n][t];
        return false;
    }
}