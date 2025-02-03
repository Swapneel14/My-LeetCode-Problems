
import java.util.*;

public class PT {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int row = sc.nextInt();
        //int column= sc.nextInt();
      // Nth_row(row);
      List<List<Integer>> ans = PrintIt(row);
      for (List<Integer> it : ans) {
          for (int ele : it) {
              System.out.print(ele + " ");
          }
          System.out.println();
        }
    }
    public static void nCr(int n,int r){  //for finding a particular element
        int res =1;
        for(int i=0;i<r;i++){
            res = res*(n-i);
            res= res/(i+1);
        }
        System.out.println("the element of the pascals triangle is " + res);
       

    }

    public static void Nth_row(int n){// for finding an entire row
        long ans =1;
        System.out.print(ans+" ");
        for(int i=1;i<n;i++){
            ans= ans*(n-i);
            ans= ans/i;
            System.out.print(ans+" ");
        }
        System.out.println();
    }
    public static List<Integer>generaterow(int n ){
        long ans =1;
        List<Integer>ansrow= new ArrayList<>();
        ansrow.add(1);
        for(int i=1;i<n;i++){
            ans= ans*(n-i);
            ans= ans/i;
            ansrow.add((int)ans);
        }
        return ansrow;

    }
    public static List<List<Integer>>PrintIt(int n){
        List<List<Integer>>ans = new ArrayList<>();
        for(int row = 1; row<=n;row++){
            ans.add(generaterow(row));
        }
        return ans;

    }
}
