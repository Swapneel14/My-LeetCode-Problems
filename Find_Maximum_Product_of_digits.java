import java.util.Arrays;

public class Find_Maximum_Product_of_digits {
     public static int maxProduct(int n) {
        int k=n;
        int d=0;
        while(n!=0){
          n=n/10;
          d++;
        }
        int arr[]= new int[d];
        int i=0;
        while(k!=0){
            int number=k%10;
            arr[i]=number;
            i++;
            k=k/10;
        }
        Arrays.sort(arr);
        return arr[d-1]*arr[d-2];
        
    }
    public static void main(String[] args) {
        int a=123856749;
        System.out.println(maxProduct(a));
    }
}
