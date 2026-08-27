class Solution {
    public int[] findDegrees(int[][] mat) {
        int m=mat.length,n=mat[0].length;
        int[] a=new int[m];
        for(int i=0;i<m;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(mat[i][j]!=0) count++;
            }
            a[i]=count;
        }
        return a;
    }
}