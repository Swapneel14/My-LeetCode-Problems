class Solution {
    public boolean can_add(StringBuilder sb,String s){
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(sb.toString().contains(ch+""))return false;
        }
        return true;
    }

    public static boolean hasdup(String sb) {
    int mask = 0;

    for (int i = 0; i < sb.length(); i++) {
        int bit = sb.charAt(i) - 'a';
        if ((mask & (1 << bit)) != 0) return true;
        mask |= (1 << bit);
    }
    return false;
    }
    public int solve(List<String>arr,int ind,StringBuilder sb){
          if(ind==arr.size())return 0;
          
          int skip=solve(arr,ind+1,sb);
          int take= Integer.MIN_VALUE;
          if(can_add(sb,arr.get(ind))&&(!hasdup(arr.get(ind)))){
            int old_length=sb.length();
            int length=arr.get(ind).length();
            sb.append(arr.get(ind));
             take=solve(arr,ind+1,sb)+length;
             sb.setLength(old_length);

          }
          return Math.max(take,skip);

    }

    public int maxLength(List<String> arr) {
        StringBuilder sb=new StringBuilder();
        return solve(arr,0,sb);
    }
}
