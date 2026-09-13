class Solution {
    public int trap(int[] a) {
        int l=0,r=a.length-1,lmax=0,rmax=0,water=0;
        while(l<=r){
            if(a[l]<=a[r]){
                if(a[l]>=lmax) lmax=a[l];
                else water+=lmax-a[l];
                l++;
            } else {
                if(a[r]>=rmax) rmax=a[r];
                else water+=rmax-a[r];
                r--;
            }
        }
        return water;
    }
}