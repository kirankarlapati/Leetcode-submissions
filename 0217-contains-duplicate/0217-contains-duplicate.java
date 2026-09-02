class Solution {
    public boolean containsDuplicate(int[] a) {
       HashSet<Integer> hs=new HashSet<>();
        for(int x:a) {
            if(hs.contains(x)) return true;
            else hs.add(x);
        }
        return false;
    }
}