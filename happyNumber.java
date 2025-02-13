import java.util.*;
public class happyNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(isHappy(n));

    }
    public static boolean isHappy(int n) {
        Set<Integer>ans= new HashSet<>();
        while(!ans.contains(n)){
            ans.add(n);
            n= sum(n);
            if(n==1){
                return true;
            }
        }
        return false;

    }
    public static int sum(int n){
        int output=0;
        while(n!=0){
            int digit = n%10;
            output=output+(digit*digit);
            n=n/10;
        }
        return output;
    }
}
