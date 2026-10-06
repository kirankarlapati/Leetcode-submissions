class Solution {
    public int minAddToMakeValid(String s) {
        int x=0,y=0;
        for(char ch:s.toCharArray()){
            if(ch=='(') x++;
            else{
                if(x>0) x--;
                else y++;
            }
        }
        return x+y;
    }
}