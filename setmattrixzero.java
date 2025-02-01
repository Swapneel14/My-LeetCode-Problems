
import java.util.* ;
public class setmattrixzero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m= sc.nextInt();
        int n= sc.nextInt();
        int[][] matrix= new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        int arr[]=new int[n];
        int brr[]=new int[m];
        for(int i=0;i<n;i++){
            arr[i]=0;
        }
        for(int j=0;j<m;j++){
            brr[j]=0;
        }
for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
        if(matrix[i][j]==0){
            arr[i]=1;
            brr[j]=1;
        }
    }
}
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if (arr[i]==1||brr[j]==1) {
                    matrix[i][j]=0;
                }
            }
                }

                for(int i=0;i<m;i++){
                    for(int j=0;j<n;j++){
                        System.out.print(matrix[i][j]+" ");
                    }
                    System.out.println();
                }
    }




        

    }

