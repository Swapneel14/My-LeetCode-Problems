class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        int n=s.length();
        int c=1;
        for(int i=0;i<n;i++){
            if(sb.length()!=0&&sb.charAt(sb.length()-1)==s.charAt(i)){
                c++;
            }
            else {
                c=1;
            }
            if(c<=2)sb.append(s.charAt(i));
            
        }
        return sb.toString();
    }
}
