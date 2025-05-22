public class Count_Inversionsgfg {
    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 4, 1};
        int c=0;
        int n=arr.length;
        int ans=sort(arr,0,n-1);
        System.out.println(ans);
    }
    public static int sort(int[]arr,int low,int high){
        int c=0;
        if(low==high)return 0;
       int mid=(low+high)/2;
      c+=  sort(arr,low,mid);
       c+= sort(arr,mid+1,high);
     c+=merge(arr,low,mid,high);
     return c;
        
    }
    public static int merge(int[]arr,int low,int mid,int high){
        int c=0;
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
            c=c+(mid-i+1);
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
return c;

}
}