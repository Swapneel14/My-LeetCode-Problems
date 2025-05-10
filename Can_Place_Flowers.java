public class Can_Place_Flowers {
    public static boolean canPlaceFlowers(int[] arr, int x) {
        int n= arr.length;
        if(n==1){
            if(arr[0]==0){
                if(x==1||x==0)return true;
                else{
                    return false;
                }
            }
            else{
                if(x==0)return true;
                else{
                    return false;
                }
            }
        }
        int c=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                if(i!=0&&i!=n-1){
                    if(arr[i+1]==0&&arr[i-1]==0){
                       c++;
                       arr[i]=1;
                    }
                    
                }
                    else if(i==0){
                      if(arr[i+1]==0){
                        c++;
                       arr[i]=1;
                      }
                      
                    }
                    else{
                        if(arr[i-1]==0){
                            c++;
                       arr[i]=1;
                        }
                        
                    }
                }
            }
            return c>=x;
        }
        public static void main(String[] args) {
            int arr[]={1,0,1,0,0,0,1,1,0,0,1,0,0,0,1};
            int x=4;
            System.out.println(canPlaceFlowers(arr,x));
        }
}
