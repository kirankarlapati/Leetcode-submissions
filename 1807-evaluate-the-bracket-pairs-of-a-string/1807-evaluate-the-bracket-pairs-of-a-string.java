class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String> hm=new HashMap<>();
        StringBuilder ans=new StringBuilder();
        for(List<String> x:knowledge) hm.put(x.get(0),x.get(1));
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                int j=s.indexOf(')',i+1);
                String x=s.substring(i+1,j);
                ans.append(hm.getOrDefault(x,"?"));
                i=j;
            }
            else ans.append(s.charAt(i));
        }
        return ans.toString();
    }
}