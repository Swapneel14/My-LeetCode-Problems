class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:nums1){
            map.put(num,map.getOrDefault(num,0)+1);
        }
            List<Integer>list=new ArrayList<>();
            for(int x:nums2){
                if(map.containsKey(x)){
                    list.add(x);
                    map.remove(x);
                }
            }
            int[]ans=new int[list.size()];
            for(int i=0;i<list.size();i++){
                ans[i]=list.get(i);
            }
            return ans;
        
    }
}
