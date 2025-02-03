import java.util.Scanner;

public class Hashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] hash = new int[13];
        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }
        int q = sc.nextInt();
        System.out.println(hash[q]);
    }

}
