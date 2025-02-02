import java.util.Scanner;

public class StocksBuyandSell {
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] digits= new int[n];
        for(int i=0;i<n;i++){
            digits[i]=sc.nextInt();
        }
        int ans = solution(digits);
        System.out.println(ans);
    }
    static int solution(int[]prices){
        int mini =prices[0];
        int n= prices.length;
        int p=0;
        for(int i=1;i<n;i++){
         int cost= prices[i]-mini;
            p=Math.max(p,cost);
            mini= Math.min(prices[i],mini);


        }
        return p;
    }
}
