class Solution {
    class Pair{
        String word;
        int steps;

        public Pair(String s , int val){
            this.word = s;
            this.steps = val;
        }
    }

    public int ladderLength(String begin, String end, List<String> wordList) {
         HashSet<String>set = new HashSet<>(wordList);
         Queue<Pair>q = new LinkedList<>();

         q.offer(new Pair(begin,1));
         while(!q.isEmpty()){
            String word = q.peek().word;
           
            int steps = q.peek().steps;
            if(word.equals(end))return steps;
            q.poll();

            int n = word.length();
            char[]arr = word.toCharArray();
            for(int i = 0 ; i < n ; i++){
                 char og = arr[i];
                 for(char ch = 'a'; ch<='z';ch++){
                    arr[i] = ch;
                    String next = new String(arr);
                    if(set.contains(next)){
                        q.offer(new Pair(next,steps+1));
                        set.remove(next);
                    }
                 }
                 arr[i] = og;
            }
         }
         return 0;

    }
}
