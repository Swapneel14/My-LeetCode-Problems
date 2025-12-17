class Solution {
    public int minOperations(int[] nums, int k) {
        int xor=0;
        for(int x:nums){
            xor^=x;
        }
        return Integer.bitCount(xor^k);
    }
}
