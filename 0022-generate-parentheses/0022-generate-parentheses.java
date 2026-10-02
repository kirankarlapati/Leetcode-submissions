class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        result("",res,0,0,n);
        return res;
    }
    void result(String s,List<String> res,int l,int r,int n){
        if(s.length()==2*n){
            res.add(s);
            return;
        }
        if(l<n) result(s+"(",res,l+1,r,n);
        if(l>r) result(s+")",res,l,r+1,n);
    }
}