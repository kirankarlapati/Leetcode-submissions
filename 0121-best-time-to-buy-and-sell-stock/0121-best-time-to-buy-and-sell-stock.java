class Solution {
    public int maxProfit(int[] a) {
        int min=Integer.MAX_VALUE,max=0;
        for(int x:a){
            min=Math.min(min,x);
            max=Math.max(max,x-min);
        }
        return max;
    }
}