import java.util.Scanner;

public class PlusOne {
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] digits= new int[n];
        for(int i=0;i<n;i++){
            digits[i]=sc.nextInt();

        }
        int[] result = solution(digits);
        
        // Printing the result
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        sc.close();
     }
     static int[] solution(int[]digits){
        int n= digits.length;
        for(int i=n-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int[] ans = new int[n+1];
        ans[0]=1;
        return ans;
        
    }
     }

