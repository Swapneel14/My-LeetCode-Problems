public class bubblesort {
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={6,1,9,4,3,89};
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]) {
                    int s=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=s;
                    
                }
            }
        }
        print(arr);
    }
}
