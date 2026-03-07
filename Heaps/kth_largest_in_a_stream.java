class KthLargest {
    int k;
    PriorityQueue<Integer> pq = new PriorityQueue<>();

    public KthLargest(int k, int[] nums) {
        //arr=new int[nums.length];
        this.k = k;
        for (int i = 0; i < nums.length; i++) {
            pq.offer(nums[i]);
        }
    }

    int solve(int val) {
       while(pq.size()>k)pq.poll();
       return pq.peek();
    }

    public int add(int val) {
        pq.offer(val);
        return solve(val);

    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
