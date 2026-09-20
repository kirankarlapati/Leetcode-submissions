class Solution {
    public int reverseDegree(String s) {
       int x=0;
       for(int i=0;i<s.length();i++){
            int pos='z'-s.charAt(i)+1;
            x+=(i+1)*pos;
       }
       return x;
    }
}