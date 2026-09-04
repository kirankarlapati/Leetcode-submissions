class Solution {
    public String longestCommonPrefix(String[] st) {
        StringBuilder sb=new StringBuilder();
        Arrays.sort(st);
        String f=st[0];
        String l=st[st.length-1];
        for(int i=0;i<Math.min(f.length(),l.length());i++){
            if(f.charAt(i)==l.charAt(i)) sb.append(f.charAt(i));
            else return sb.toString();
        }
        return sb.toString();
    }
}