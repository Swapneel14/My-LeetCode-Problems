
class Solution {//Leetcode-->560
    public int subarraySum(int[] arr, int k) {
         
        HashMap<Integer,Integer>map=new HashMap<>();
        int sum=0;
        int ans=0;
        for(int i=0;i<arr.length;i++){
            int currsum=sum+=arr[i];
            if(sum==k)ans+=1;
            if(map.containsKey(sum-k)){
                ans+=map.get(sum-k);
            }
            map.put(currsum,map.getOrDefault(currsum,0)+1);
        }
        return ans;
    }
}
