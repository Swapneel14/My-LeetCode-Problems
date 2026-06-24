class Solution {
    public int minSteps(int[] arr, int start, int end) {
        // code here
        Queue<int[]>q = new LinkedList<>();
        q.offer(new int[]{start,0});
        
        HashSet<Integer>set = new HashSet<>();
        set.add(start);
        
        while(!q.isEmpty()){
            int curr[] = q.poll();
            int val = curr[0];
            int steps = curr[1];
            
            if(val==end)return steps;
            
            for(int x : arr){
                int next = (val * x)%1000;
                if(!set.contains(next)){
                     q.offer(new int[]{next,steps+1});
                     set.add(next);
                }
               
            }
        }
        return -1;
    }
}
