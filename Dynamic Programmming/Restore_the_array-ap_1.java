import java.util.Arrays;
class Solution {
    int solve(String s,int start,int[]dp,int k){
        if(start>=s.length())return 1;
        if(dp[start]!=-1)return dp[start];
        if(s.charAt(start)=='0')return 0;
        long num=0;
        long curr=0;
        for(int ind=start;ind<s.length();ind++){
            num=(num*10)+s.charAt(ind)-'0';
            if(num>k)break;
            curr=(curr+solve(s,ind+1,dp,k))%1000000007;
        }
        return dp[start]=(int)curr;

    }

    public int numberOfArrays(String s, int k) {
        int[]dp=new int[s.length()];
        Arrays.fill(dp,-1);
        return solve(s,0,dp,k);
    }
}
