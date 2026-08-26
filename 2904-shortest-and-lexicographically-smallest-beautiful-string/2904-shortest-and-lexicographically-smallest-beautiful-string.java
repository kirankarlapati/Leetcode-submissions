class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int ones=0,l=0,n=s.length();
        String b="";
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='1') ones++;
            while(ones>k) {
                if(s.charAt(l)=='1') ones--;
                l++;
            }
            if(ones==k){
                while(s.charAt(l)=='0') l++;
                String check=s.substring(l,i+1);
                // if(check.compareTo(b)<0) b=check;
                if (b.equals("") || check.length() < b.length()
                        || (check.length() == b.length()
                            && check.compareTo(b) < 0)) {

                    b = check;
                }
            }
        }
        return b;
    }
}