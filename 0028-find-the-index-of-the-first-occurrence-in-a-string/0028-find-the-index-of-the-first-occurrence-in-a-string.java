class Solution {
    public int strStr(String h, String n) {
        int nl=n.length(),hl=h.length();
        if(nl==1 && h.equals(n)) return 0;
        for(int i=0;i<=hl-nl;i++) if(n.equals(h.substring(i,i+nl))) return i;
        return -1;
    }
}