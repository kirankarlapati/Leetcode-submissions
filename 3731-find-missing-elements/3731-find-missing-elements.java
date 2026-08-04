class Solution {
    public List<Integer> findMissingElements(int[] a) {
        ArrayList<Integer> al=new ArrayList<>();
        if(a.length==0) return al;
        Arrays.sort(a);
        int x=a[0];
        for(int i=1;i<a.length;i++){
            while(x+1<a[i]){
                x++;
                al.add(x);
            }
            x=a[i];
        }
        return al;
    }
}