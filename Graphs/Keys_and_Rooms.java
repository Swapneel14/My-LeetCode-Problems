class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        HashSet<Integer>set = new HashSet<>();
        Queue<Integer>q = new LinkedList<>();
        set.add(0);
        q.offer(0);

        while(!q.isEmpty()){
            int curr = q.poll();

            for(int key : rooms.get(curr)){
                if(!set.contains(key)){
                    q.offer(key);
                    set.add(key);
                }
            }
        }

        return set.size()==n;

    }
}
