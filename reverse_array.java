public class reverse_array {

    public static void main(String [] args){
        int arr[]= {1,2,3,4,5,6,7,8,9};
        reverse(arr);

    }
    public static void reverse(int arr[]){
        int start = 0;
        int end = arr.length -1;
        while(start< end){
            int k = arr[start];
            arr[start]= arr[end];
            arr[end]=k;
            start++;
            end--;
        }
        for(int i=0;i<arr.length;i++){
            System.err.print(arr[i]+" ");
        }
    }
}