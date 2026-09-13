class Solution {
    public int characterReplacement(String s, int k) {
        int l=0,max=0,ans=0;
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
            max=Math.max(max,hm.get(ch));
            if(i-l+1-max>k){
                char chl=s.charAt(l);
                hm.put(chl,hm.get(chl)-1);
                l++;
            }
            ans=Math.max(ans,i-l+1);
        }
        return ans;
    }
}