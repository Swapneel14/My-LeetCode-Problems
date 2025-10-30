class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character>st=new Stack<>();
        int n=s.length();
        if(n<=2)return "";
        StringBuilder sb=new StringBuilder();
        int open=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='('){
                open++;
                if(open>1)sb.append('(');
            }
            else{
                if(open>1)sb.append(')');
                open--;
            }
        }
        return sb.toString();
    }
}
