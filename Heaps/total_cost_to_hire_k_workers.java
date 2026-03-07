class Solution {
    public long totalCost(int[] costs, int k, int can) {
        PriorityQueue<Integer>pq1=new PriorityQueue<>();
        PriorityQueue<Integer>pq2=new PriorityQueue<>();
        int hired=0;
        int n=costs.length;
        long ans=0;
        int i=0,j=n-1;
        while(hired<k){
            while(pq1.size()<can&&i<=j){
                pq1.offer(costs[i]);
                i++;
            }
            while(pq2.size()<can&&i<=j){
                pq2.offer(costs[j]);
                j--;
            }

            int min1=(pq1.isEmpty()?Integer.MAX_VALUE:pq1.peek());
            int min2=(pq2.isEmpty()?Integer.MAX_VALUE:pq2.peek());
            if(min1<=min2){
                ans+=min1;
                pq1.poll();
            }
            else{
                ans+=min2;
                pq2.poll();
            }

            hired++;
        }

        return ans;
    }
}
