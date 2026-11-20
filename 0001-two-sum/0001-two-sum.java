class Solution {
    public int[] twoSum(int[] nums, int t) {
        int l=0,r=nums.length-1;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int x=t-nums[i];
            if(hm.containsKey(x)) return new int[] {hm.get(x),i};
            hm.put(nums[i],i);
        }
        return new int[] {};
    }
}