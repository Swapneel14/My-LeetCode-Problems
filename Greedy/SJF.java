class Solution {
    static int solve(int bt[]) {
        
        Arrays.sort(bt);
        int n = bt.length;
        int sum = 0;
        int ans = 0;
        for(int i = 0 ;i <n;i++){
            ans+=sum;
            sum+=bt[i];
        }
        return ans/n;
    }
}
