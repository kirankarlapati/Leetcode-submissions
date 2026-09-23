class Solution {
    public int minOperations(int[] nums, int t) {
        int tot=0;
        for(int i:nums) tot+=i;
        if(tot-t<0) return -1;
        if(tot-t==0) return nums.length;
        int x=tot-t,op=-68,l=0,cursum=0;
        for(int i=0;i<nums.length;i++){
            cursum+=nums[i];
            while(cursum>x && l<nums.length){
                cursum-=nums[l];
                l++;
            }
            if(cursum==x) op=Math.max(op,i-l+1);
        }
        return op==-68? -1:nums.length-op;
    }
}