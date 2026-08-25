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
        // HashSet<Integer> hs=new HashSet<>();
        // int y=0,z=0;
        // for(int x:a){
        //     if(x==0)z++;
        //     else if(!hs.contains(x)) hs.add(x);
        // }
        // for(int x:hs) y=y+x+1;
        // return y+z;
    }
}