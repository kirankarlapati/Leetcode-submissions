class Solution {
    public String longestCommonPrefix(String[] a) {
        String pre=a[0];
        for(int i=1;i<a.length;i++){
            String cr=a[i];
            int j=0,prelen=pre.length();
            while(j<prelen && j<cr.length() && pre.charAt(j)==cr.charAt(j)) j++;
            pre=pre.substring(0,j);
        }
        return pre;
    }
}