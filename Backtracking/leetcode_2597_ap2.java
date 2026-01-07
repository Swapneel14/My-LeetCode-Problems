class Solution {
    int count=0;

    public void solve(List<Integer>curr,int ind,int[]nums,int k){
        if(ind==nums.length){
           count++;
           return;
        }
       
       
            boolean ok=true;
            for(int i=0;i<curr.size();i++){
                if(nums[ind]-curr.get(i)==k){
                   ok=false;
                   break;
                }
            }
            if(ok){
                 curr.add(nums[ind]);
                 solve(curr,ind+1,nums,k);
                 curr.remove(curr.size()-1);
            }

            solve(curr,ind+1,nums,k);

       
    }
    public int beautifulSubsets(int[] nums, int k) {
        Arrays.sort(nums);
       
        List<Integer>curr=new ArrayList<>();

        solve(curr,0,nums,k);

        return count-1;
    }
}
