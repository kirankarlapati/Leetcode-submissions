class Solution {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character, Integer> hm=new LinkedHashMap<>();
        for(int i=0;i<s.length();i++) hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        for(Map.Entry<Character, Integer> x:hm.entrySet()) if(x.getValue()==1) return s.indexOf(x.getKey());
        return -1;
    }
}