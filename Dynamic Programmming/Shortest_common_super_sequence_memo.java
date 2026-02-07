class Solution {
    
    public static int solve(String s1,String s2,int i,int j,int[][]dp){
        if(i==s1.length()&&j==s2.length())return 0;
        if(i==s1.length())return s2.length()-j;
        if(j==s2.length())return s1.length()-i;
        
        if(dp[i][j]!=-1)return dp[i][j];
        
        int ans=0;
        if(s1.charAt(i)==s2.charAt(j)){
            ans=1+solve(s1,s2,i+1,j+1,dp);
        }
        else{
            ans=1+Math.min(solve(s1,s2,i+1,j,dp),solve(s1,s2,i,j+1,dp));
        }
        return dp[i][j]=ans;
        
    }
    
    public static int minSuperSeq(String s1, String s2) {
        // code here
        
        int[][]dp=new int[s1.length()][s2.length()];
        for(int i=0;i<s1.length();i++){
            Arrays.fill(dp[i],-1);
        }
        
        return solve(s1,s2,0,0,dp);
        
    }
}
