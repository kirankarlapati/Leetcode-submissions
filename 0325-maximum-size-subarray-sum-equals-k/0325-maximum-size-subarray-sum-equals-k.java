class Solution {
    public int maxSubArrayLen(int[] nums, int k) {
        HashMap<Integer, Integer> hm =new HashMap<>();
        hm.put(0,-1);
        int l=0,max=0,pre=0,n=nums.length;
        for(int i=0;i<n;i++){
            pre+=nums[i];
            if(hm.containsKey(pre-k)){
                int s=i-hm.get(pre-k);
                max=Math.max(max,s);
            }
            hm.putIfAbsent(pre,i);
        }
        return max;
    }
}