import java.util.*;
//This is my own apporach so the T.C and S.C can be a lot better//
public class subsequence{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b= sc.nextLine();
        System.out.println(isSubsequence(a,b));
    }
     public static boolean isSubsequence(String s, String t) {
        int ns=s.length();
        int nt= t.length();
        if(ns==0)return true;
        ArrayList<Character>s1=new ArrayList<>();
        ArrayList<Character>list= new ArrayList<>();
        for(int i=0;i<ns;i++){
           s1.add(s.charAt(i));
        }
        int j=0;
        for(int i=0;i<nt;i++){
            if(s1.get(j)==t.charAt(i)){
                list.add(t.charAt(i));
                j++;
                if(j==ns)break;


            }
           
        }
        if(list.size()==ns){
         for(int i=0;i<ns;i++){
            if(s.charAt(i)!=list.get(i))return false;
            
            
         }
         return true;
        }
        else{
            return false;
        }
    }
}