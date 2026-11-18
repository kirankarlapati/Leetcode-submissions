class Solution {
    public boolean containsDuplicate(int[] a) {
       HashSet<Integer> hs=new HashSet<>();
       for(int x:a) if(!hs.add(x)) return true;
        // if(!hs.contains(x)) hs.add(x);
        // else return true;
       return false;
    }
}