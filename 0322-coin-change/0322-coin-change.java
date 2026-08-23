class Solution {
    public int coinChange(int[] coins, int a) {
        int n=coins.length;
        int[][] dp=new int[n][a+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<a+1;j++){
                if(i==0){
                    if(j%coins[i]==0) dp[i][j]=j/coins[i];
                    else dp[i][j]=a+1;
                }
                else if(j==0) dp[i][j]=0;
                else if(coins[i]>j) dp[i][j]=dp[i-1][j];
                else dp[i][j]=Math.min(dp[i-1][j],dp[i][j-coins[i]]+1);
            }
        }
        return dp[n-1][a]==a+1? -1:dp[n-1][a];
    }
}