class Solution {//TC; 2^N  SC: O(N)
    int max=0;
      public void solve(int[]arr,int p,int s,int e,int curr){
        max = Math.max(max, curr);   
        if(s>e){
            max=Math.max(max,curr);
           return;
        }
        int c1=0,c2=0;
         if(arr[s]<=p){
            solve(arr,p-arr[s],s+1,e,curr+1);
         }
        else if(curr>0){
            solve(arr,p+arr[e],s,e-1,curr-1);
         }
         else{
            return;
         }
         
      }
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int s_index=0;
        int n=tokens.length;
        int e_index=n-1;
        int ans=0;

        if(n==0||tokens[s_index]>power)return 0;

        solve(tokens,power,0,n-1,0);
        return max;

    }
}
