class Solution {
    public int celebrity(int arr[][]) {
        // code here
        int n=arr.length;
        int iknow[]=new int[n];
        int knowme[]=new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j&&arr[i][j]==1){
                    iknow[i]++;
                    knowme[j]++;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(iknow[i]==0&&knowme[i]==n-1)return i;
        }
        return -1;
        
        
    }
}
