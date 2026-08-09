class Solution {
    public int maximalSquare(char[][] a) {
        int m=a.length;
        int n=a[0].length;
        int[][] dp=new int[m][n];
        int max=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0 || a[i][j]-'0'==0){
                    dp[i][j]=a[i][j]-'0';
                    max=Math.max(max,dp[i][j]);
                    continue;
                }
                // if(a[i][j]==0-'0')dp[i][j]=0;
                int t=dp[i-1][j],l=dp[i][j-1],dig=dp[i-1][j-1];
                /*if((t+l+dig)!=0)*/ dp[i][j]=1+Math.min(t,Math.min(l,dig));
                max=Math.max(max,dp[i][j]);
            }
        }
        return max*max;
    }
}