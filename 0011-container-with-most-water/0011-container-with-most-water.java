class Solution {
    public int maxArea(int[] a) {
        int l=0,r=a.length-1,max=0;
        while(l<r){
            int b=r-l,len=Math.min(a[l],a[r]);
            max=Math.max(max,b*len);
            if(a[l]<a[r]) l++;
            else r--;
        }
        return max;
    }
}