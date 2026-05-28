class Solution {
    class Pair{
        char ch;
        int freq;

        public  Pair(char c,int f){
            ch=c;
            freq=f;
        }

    }

    public String longestDiverseString(int a, int b, int c) {
        PriorityQueue<Pair>pq = new PriorityQueue<>((a1,b1)->{
           return Integer.compare(b1.freq,a1.freq);
        });

        if(a>0)pq.offer(new Pair('a',a));
        if(b>0)pq.offer(new Pair('b',b));
        if(c>0)pq.offer(new Pair('c',c));

        StringBuilder sb = new StringBuilder();

        while(!pq.isEmpty()){
            Pair curr = pq.poll();
            char ch = curr.ch;
            int freq = curr.freq;

            if(sb.length()>=2&&sb.charAt(sb.length()-1)==ch&&sb.charAt(sb.length()-2)==ch){
                if(pq.isEmpty())break;

                Pair next = pq.poll();
                char next_ch = next.ch;
                int next_freq = next.freq;

                sb.append(next_ch);
                next_freq--;
                if(next_freq>0)pq.offer(new Pair(next_ch,next_freq));
            }
            else{
                sb.append(ch);
                freq--;
            }

            if(freq>0)pq.offer(new Pair(ch,freq));
        }

        return sb.toString();
    }
}
