import java.util.*;
public class LeetCode_20 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        
        System.out.println(solution(s));
        
    }
    public static boolean solution(String s){
        Stack<Character>st= new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                st.push(s.charAt(i));
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                char ch= st.pop();
                if(s.charAt(i)==')'&&ch=='('||s.charAt(i)=='}'&&ch=='{'||s.charAt(i)==']'&&ch=='['){
                    continue;
                }
                else{
                    return false;
                }

            }
          
            

        }
        return st.isEmpty();
    }
}
