import java.util.*;

public class printname_recursion {
    public static void print(int n){
        
        
        if (n>) {
            return;
            
        }
        
        
            System.out.println(n);
            print(n+1);
        
       

    }
    public static void main(String[] args) {
        int n=1;
        Scanner sc= new Scanner(System.in);
        int m = sc.nextInt();
        print(n);
    }
}
