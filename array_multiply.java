public class array_multiply {
    public static void main(String[] args) {
        int arr[]={2,3,78,7};
        mul(arr);
    }
    public static void mul(int [] arr) {
        
        int mul=1;
        for(int i=0;i<arr.length;i++){
            mul=mul*arr[i];
        }
        System.out.println(mul);
    }
}
