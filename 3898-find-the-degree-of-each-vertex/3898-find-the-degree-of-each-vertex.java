class Solution {
    public int[] findDegrees(int[][] mat) {
        int[] a=new int[mat.length];
        for(int i=0;i<mat.length;i++) for(int j=0;j<mat[0].length;j++) a[i]+=mat[i][j];
        return a;
    }
}