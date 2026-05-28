class Solution {
    public int minSetSize(int[] arr) {
        int[]freq = new int[100001];
        int n = arr.length;

        for(int x : arr){
            freq[x]++;
        }

        PriorityQueue<Integer>pq = new PriorityQueue<>((a,b)->Integer.compare(b,a));
        for(int f : freq){
            if(f>0)pq.offer(f);
        }

        int ans = 0;
        int size = 0;

        while(size<n/2){
            size+=pq.poll();
            ans++;
        }

        return ans;
    }
}
