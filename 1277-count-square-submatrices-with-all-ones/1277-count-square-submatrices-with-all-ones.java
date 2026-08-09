class Solution {
    public int countSquares(int[][] a) {
        int m=a.length;
        int n=a[0].length;
        int[][] dp=new int[m][n];
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0 || a[i][j]==0){
                    dp[i][j]=a[i][j];
                    count+=dp[i][j];
                    continue;
                }
                int t=dp[i-1][j];
                int l=dp[i][j-1];
                int dig=dp[i-1][j-1];
                dp[i][j]=1+Math.min(t,Math.min(l,dig));
                count+=dp[i][j];
            }
        }
        return count;
    }
}