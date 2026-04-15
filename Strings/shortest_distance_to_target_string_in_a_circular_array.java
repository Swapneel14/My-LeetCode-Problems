class Solution {
    public int closestTarget(String[] words, String target, int start) {
        HashSet<Integer>set = new HashSet<>();
        int n = words.length;
        for(int i = 0 ; i < n ; i ++){
            if(words[i].equals(target))set.add(i);
        }

        if(set.isEmpty())return -1;
        int ans = Integer.MAX_VALUE;

        for(int ind : set){
          ans = Math.min(ans,Math.abs(start-ind));
          ans = Math.min(ans,Math.abs(n-Math.abs(start-ind)));
        }

        return ans;
    }
}
