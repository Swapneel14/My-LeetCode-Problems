class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>>ans = new ArrayList<>();
        int m = nums1.length;
        int n = nums2.length;

        PriorityQueue<int[]>pq = new PriorityQueue<>((a,b)->Integer.compare(a[0],b[0]));
        HashSet<String> visited = new HashSet<>();

        pq.offer(new int[]{nums1[0]+nums2[0],0,0});
        visited.add("0,0");

        while(k-->0&&!pq.isEmpty()){
            int[]curr = pq.poll();

            List<Integer>list = new ArrayList<>();
            list.add(nums1[curr[1]]);
            list.add(nums2[curr[2]]);

            ans.add(list);

            int i = curr[1];
            int j = curr[2];

            if(i+1<m&&!visited.contains((i+1) + "," + j)){
                pq.offer(new int[]{nums1[i+1]+nums2[j],i+1,j});
                  visited.add((i+1) + "," + j);
            }

            
            if(j+1<n&&!visited.contains(i + "," + (j+1))){
                pq.offer(new int[]{nums1[i]+nums2[j+1],i,j+1});
                 visited.add(i + "," + (j+1));
            }
        }

        return ans;

        
    }
}
