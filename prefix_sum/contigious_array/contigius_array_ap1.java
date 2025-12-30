class Solution {
    public int findMaxLength(int[] nums) {
        int n=nums.length;
        HashMap<Integer,List<Integer>>map=new HashMap<>();
        if(nums[0]==0)nums[0]=-1;
        for(int i=1;i<n;i++){
            if(nums[i]==0)nums[i]=nums[i-1]-1;
            else nums[i]=nums[i-1]+1;
        }
        for(int i=0;i<n;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],new ArrayList<>());
            }
            map.get(nums[i]).add(i);
        }

        int ans=0;
        for(int x:map.keySet()){
             if(x==0){
                    ans=Math.max(ans,map.get(x).get(map.get(x).size()-1)+1 );
                    continue;
                }
            if(map.get(x).size()>1){
               
               
                   int diff=map.get(x).get(map.get(x).size()-1)-map.get(x).get(0);
                   ans=Math.max(ans,diff);
                
            }
        }
        return ans;
    }
}
