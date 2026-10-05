class Solution {
    public int scoreOfParentheses(String s) {
        int ans=0,d=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') d++;
            else {
                d--;
                if(s.charAt(i-1)=='(') ans+=Math.pow(2,d);
            }
        }
        return ans;
    }
}