//TC(O(2^n * n));
//SC(O(2^n * n));

class Solution {

    public void solve(List<Integer>curr,List<List<Integer>>ans,int ind,int[]nums,int k){
        if(ind==nums.length){
           if(curr.size()>0){
             ans.add(new ArrayList<>(curr));
           }
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
                 solve(curr,ans,ind+1,nums,k);
                 curr.remove(curr.size()-1);
            }

            solve(curr,ans,ind+1,nums,k);

       
    }
    public int beautifulSubsets(int[] nums, int k) {
        Arrays.sort(nums);
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>curr=new ArrayList<>();

        solve(curr,ans,0,nums,k);

        return ans.size();
    }
}
