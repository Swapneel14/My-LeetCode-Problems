class Solution {//Leetcode-->Hard
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer>arr=new ArrayList<Integer>();
        int i=0,j=0;
        while(i<nums1.length&&j<nums2.length){
            if(nums1[i]<nums2[j]){
                i++;
            }
            else if(nums1[i]>nums2[j]){
                j++;
            }
            else{
                arr.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[]ans=new int[arr.size()];
        int k=0;
        while(k<arr.size()){
            ans[k]=arr.get(k);
            k++;
        }
        return ans;
        
    }
}
