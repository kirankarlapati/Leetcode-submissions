class Solution {
    public String smallestString(String s) {
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        // int count=0;
        boolean check=false;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(!check){
                if(ch=='a') sb.append(ch);
                else {
                    check=true;
                    sb.append(--ch);
                }
            } else {
                if(ch=='a'){
                    sb.append(s.substring(i));
                    break;
                }
                else sb.append(--ch);
            }
            // if(ch!='a'){
            //     count++;
            //     ch--;
            //     sb.append(ch);
            // } else if(count>=1 && ch=='a') {
            //     sb.append(s.substring(i,n));
            //     break;
            // } else if(count==0 && ch=='a') sb.append(ch);
            // if(chrec!='a'){
            //     chrec--;
            //     sb.append(chrec);
            // } else sb.append(chrec);
        }
        if(!check) sb.setCharAt(n-1,'z');
        return sb.toString();
    }
}