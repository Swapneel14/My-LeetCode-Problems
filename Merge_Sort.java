public class Merge_Sort{//merge sort
    public static void main(String[] args) {
     int arr[]={1,4,2,9,5,2,6,7,9,3,6,12,3,4,5,4,3};  
     sort(arr,0,arr.length-1);
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    }
    public static void sort(int[]arr,int low,int high){
        if(low==high)return;
        int mid=(low+high)/2;
        sort(arr,low,mid);
        sort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    public static void merge(int[]arr,int low,int mid,int high){
       int i=low;
       int j=mid+1;
       int k=0;
       int ans[]=new int[high-low+1];
       while(i<=mid&&j<=high){
        if(arr[i]<=arr[j]){
        ans[k]=arr[i];
        i++;
        k++;
        
        }
        else{
            ans[k]=arr[j];
            j++;
            k++;
        }
       }
       while(i<=mid){
        ans[k]=arr[i];
        k++;
        i++;
        
}
 while(j<=high){
        ans[k]=arr[j];
        j++;
        k++;
        
}
int m=0;
for(int t=low;t<=high;t++){
    arr[t]=ans[m];
    m++;
}
}
}