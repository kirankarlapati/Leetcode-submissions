class Solution {
    public int smallestIndex(int[] a) {
        for(int i=0;i<a.length;i++){
            int x=0,n=a[i];
            while(n>0){
                x+=n%10;
                n/=10;
            }
            if(x==i) return i;
        }
        return -1;
    }
}