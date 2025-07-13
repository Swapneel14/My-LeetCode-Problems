class Solution {
    public int myAtoi(String s) {
       boolean neg=false;
       long ans=0;
       int i=0;
       int n=s.length();
       while(i<n&&s.charAt(i)==' '){
        i++;
       }
     if (i < n && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
    neg = s.charAt(i) == '-';
    i++;
}
        while(i<n&&Character.isDigit(s.charAt(i))){
         ans= ans*10+(s.charAt(i)-'0');
         if(!neg && ans>Integer.MAX_VALUE)return Integer.MAX_VALUE;
         if(neg && -ans<Integer.MIN_VALUE)return Integer.MIN_VALUE;
         i++;
       }
       if(neg)ans=-ans;
       return (int)ans;


    }
}
