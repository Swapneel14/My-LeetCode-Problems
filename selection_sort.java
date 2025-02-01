public class selection_sort {
    public static void sort(int arr[]){
        
        for(int i=0;i<arr.length-1;i++){
           int small=i;
            for(int j=1;j<arr.length;j++){
               if (arr[i]>arr[j]) { 
    small=j;
}       
              }
                int temp=arr[i];
                arr[i]=arr[small];
                arr[small]=temp;
              }
              
        }
    
    public static void main(String[] args) {
        int arr[]={1,4,5,3,2};
        sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

}