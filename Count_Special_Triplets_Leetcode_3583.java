class Solution {
    public int specialTriplets(int[] arr) {
        int n=arr.length;
        long MOD = 1_000_000_007;
        long ans=0;
      HashMap<Integer,Integer>bef=new HashMap<>();
       HashMap<Integer,Integer>af=new HashMap<>();
       for(int x:arr){
        af.put(x,af.getOrDefault(x,0)+1);
       }

        for(int i=0;i<n;i++){
            int v=arr[i];
            af.put(v,af.get(v)-1);
            if(af.get(v)==0)af.remove(v);
            long left=bef.getOrDefault(v*2,0);
            long right=af.getOrDefault(v*2,0);
           ans = (ans + (left * right) % MOD) % MOD;

             bef.put(v,bef.getOrDefault(v,0)+1);
        }
        return (int)ans;

    }
}
