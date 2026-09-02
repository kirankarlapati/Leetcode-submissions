class Solution {
    public int maxSubArray(int[] a) {
        int x=a[0],y=a[0];
        for(int i=1;i<a.length;i++){
            x=Math.max(a[i],x+a[i]);
            y=Math.max(x,y);
        }
        return y;
    }
}