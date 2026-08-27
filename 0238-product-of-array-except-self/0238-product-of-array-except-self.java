class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pro=1,count=0;
        int[] a=new int[nums.length];
        for(int x:nums) {
            if(x==0) count++;
            else pro*=x;
        }
        if(count>1) {
            Arrays.fill(a,0);
            return a;
        } else {
            for(int i=0;i<nums.length;i++){
                if(nums[i]!=0 && count>0) a[i]=0; 
                else if(nums[i]==0) a[i]=pro;
                else a[i]=pro/nums[i];
            }
        }
        return a;
    }
}