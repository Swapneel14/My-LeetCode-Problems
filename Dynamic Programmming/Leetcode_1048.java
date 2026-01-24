class Solution {//TC= o(n^2*L)
    boolean ok(String s1,String s2){
        if(s2.length()!=1+s1.length())return false;

    int i = 0, j = 0;
    boolean skipped = false;

    while (i < s1.length() && j < s2.length()) {
        if (s1.charAt(i) == s2.charAt(j)) {
            i++;
            j++;
        } else {
            if (skipped) return false;
            skipped = true;
            j++; 
        }
    }

    return true;

    }
    public int solve(String[]words,int ind,int prev,int[][]dp){
        if(ind==words.length)return 0;

        if(prev!=-1&&dp[ind][prev]!=-1)return dp[ind][prev];

        int pick=0,skip=0;
        if(prev==-1||ok(words[prev],words[ind])){
            pick=1+solve(words,ind+1,ind,dp);
        }
        skip=solve(words,ind+1,prev,dp);

        if(prev!=-1)dp[ind][prev]=Math.max(pick,skip);
        return Math.max(pick,skip);
      
    }

    public int longestStrChain(String[] words) {
        Arrays.sort(words,(a,b)->{
            return a.length()-b.length();
        });
        int[][]dp=new int[words.length+1][words.length+1];
        for(int i=0;i<=words.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(words,0,-1,dp);
    }
}
