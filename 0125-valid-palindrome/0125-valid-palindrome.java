class Solution {
    public boolean isPalindrome(String s) {
        String x=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        String rev=new StringBuilder(x).reverse().toString();
        return x.equals(rev);
    }
}