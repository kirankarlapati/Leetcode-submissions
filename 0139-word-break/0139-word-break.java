class Solution {
    public boolean wordBreak(String s, List<String> w) {
        HashSet<String> hs =new HashSet<>();
        for(String x:w) hs.add(x);
        int n=s.length();
        boolean[] dp=new boolean[n+1];
        dp[0]=true;
        for(int i=1;i<n+1;i++) for(int j=0;j<i;j++) if(hs.contains(s.substring(j,i)) && dp[j]==true) dp[i]=true;
        return dp[n];
    }
}