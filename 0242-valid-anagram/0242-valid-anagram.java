class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> hm=new HashMap<>();
        HashMap<Character,Integer> hm1=new HashMap<>();
        for(char x:s.toCharArray()) hm.put(x,hm.getOrDefault(x,0)+1);
        for(char x:t.toCharArray()) hm1.put(x,hm1.getOrDefault(x,0)+1);
        for(Map.Entry<Character,Integer> x:hm.entrySet()) if(!x.getValue().equals(hm1.get(x.getKey()))) return false;
        return true;
    }
}