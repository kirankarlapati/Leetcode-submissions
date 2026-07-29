class Solution {
    public int[] concatWithReverse(int[] nums) {
        int[] a=new int[nums.length*2];
        int j=nums.length-1;
        for(int i=0;i<nums.length*2;i++){
            if(i<nums.length) a[i]=nums[i];
            else{
                while(j>=0){
                    a[i]=nums[j];
                    i++;
                    j--;
                }
                break;
            }
        }
        return a;
    }
}