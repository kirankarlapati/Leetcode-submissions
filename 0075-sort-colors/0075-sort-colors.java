class Solution {
    public void sortColors(int[] a) {
        int l=0,mid=0,r=a.length-1;
        while(mid<=r){
            if(a[mid]==0){
                swap(a,l,mid);
                l++;
                mid++;
            } else if(a[mid]==1) mid++;
            else {
                swap(a,mid,r);
                r--;
            }
        }
    }
    public void swap(int[] a,int l,int r){
        int temp=a[l];
        a[l]=a[r];
        a[r]=temp;
    }
}