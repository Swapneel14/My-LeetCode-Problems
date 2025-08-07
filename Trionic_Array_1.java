class Solution {
    public boolean isTrionic(int[] nums) {
        int n=nums.length;
        int last=0;
        for(int i=1;i<n;i++){
            if(nums[i]<=nums[last]){
                if(i==1)return false;
                break;
            }
            else{
                last=i;
            }
        }
        if(last==n-1)return false;
        int x=last;
        for(int i=last+1;i<n;i++){
            if(nums[i]>=nums[last]){
                if(i==x+1)return false;
                break;
            }
            else{
                last=i;
            }
        }
        if(last==n-1)return false;
        int x2=last;
        for(int i=last+1;i<n;i++){
            if(nums[i]<=nums[last]){
                 if(i==x+1)return false;
                break;
            }
            else{
                last=i;
            }
        }
        return last==n-1;


    }
}
