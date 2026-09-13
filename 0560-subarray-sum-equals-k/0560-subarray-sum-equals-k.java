class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int count=0,pre=0;
        hm.put(0,1);
        for(int x:nums){
            pre+=x;
            if(hm.containsKey(pre-k)) count+=hm.get(pre-k);
            hm.put(pre,hm.getOrDefault(pre,0)+1);
        }
        return count;
    }
}