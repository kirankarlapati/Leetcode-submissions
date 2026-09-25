class Solution {
    TreeSet<String> ts=new TreeSet<>();
    public List<String> braceExpansionII(String ex) {
        check(ex);
        return new ArrayList<>(ts);
    }
    public void check(String s){
        if(s.indexOf('}')==-1){
            ts.add(s);
            return;
        }
        int j=s.indexOf('}');
        int i=s.lastIndexOf('{',j);
        String l=s.substring(0,i);
        String r=s.substring(j+1);
        String x=s.substring(i+1,j);
        for(String temp:x.split(",")){
            String y=l+temp+r;
            check(y);
        }
    }
}