class Solution {
    public String removeStars(String s) {
        int n=s.length();
        Stack<Character>st=new Stack<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='*'&&!st.isEmpty())st.pop();
            else{
                st.push(ch);
            }
                
                
            
        }
        StringBuilder sb=new StringBuilder();
        for(char c:st){
            sb.append(c);
        }
        return sb.toString();
    }
}
