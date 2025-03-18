import java.util.Scanner;
//This is with using Extra Space as There is an extra matrix used//
public class Rotate_Image_48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int matrix[][]= new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        rotate(matrix);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }


    }
    public static void rotate(int[][] arr) {
        int n= arr.length;
        int ans[][]=new int[n][n];
        
        for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
           ans[j][n-1-i]= arr[i][j];
        }
        }
         for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
           arr[i][j]=ans[i][j];
        }
        }

    }
}
