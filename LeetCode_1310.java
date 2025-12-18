class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n=arr.length;
        int x=arr[0];
        for(int i=1;i<n;i++){
         arr[i]=arr[i]^arr[i-1];
        }
        int m=queries.length;
        int[]ans=new int[m];
        for(int i=0;i<m;i++){
            int l=queries[i][0];
            int r=queries[i][1];
            if(l==0)ans[i]=arr[r];
            else ans[i]=arr[r]^arr[l-1];

        }
        return ans;
        
    }
}
