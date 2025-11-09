class Solution {
    public int minimumDistance(int[] nums) {
        HashMap<Integer,ArrayList<Integer>>map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            map.putIfAbsent(nums[i], new ArrayList<>());
            map.get(nums[i]).add(i);

        }
        int ans=Integer.MAX_VALUE;
        for (ArrayList<Integer> list : map.values()) {
          if(list.size()>=3){
              int dist=Integer.MAX_VALUE;
              int low=0;
              int high=2;
              while(high<list.size()){
                  int i=list.get(low);
                  int j=list.get(low+1);
                  int k=list.get(high);
                  dist=Math.min(dist,(j-i)+(k-j)+(k-i));
                  low++;
                  high++;
              }
              ans=Math.min(dist,ans);
          }
            
        }
        if(ans==Integer.MAX_VALUE)return -1;
        return ans;
    }
}
