class Solution {
    public int numRabbits(int[] a) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int x:a) hm.put(x,hm.getOrDefault(x,0)+1);
        int x=0;
        for(Map.Entry<Integer,Integer> y:hm.entrySet()){
            int f=(int) Math.ceil((double) y.getValue()/(y.getKey()+1));
            x+=f*(y.getKey()+1);
        }
        return x;
    }
}