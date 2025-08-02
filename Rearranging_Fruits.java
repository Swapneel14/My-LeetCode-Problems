class Solution {
    public long minCost(int[] b1, int[] b2) {
        HashMap<Integer,Integer>total=new HashMap<>();
        HashMap<Integer,Integer>c1=new HashMap<>();
        ArrayList<Long>list=new ArrayList<>();
        long min=Long.MAX_VALUE;
        int n1=b1.length;
        int n2=b2.length;
        for(int x:b1){
            total.put(x,total.getOrDefault(x,0)+1);
            min=Math.min(x,min);
        }
        for(int x:b2){
            total.put(x,total.getOrDefault(x,0)+1);
            min=Math.min(x,min);
        }
        for(HashMap.Entry<Integer,Integer>en:total.entrySet()){
            if(en.getValue()%2!=0)return -1;
        }
        for(int x:b1){
            c1.put(x,c1.getOrDefault(x,0)+1);
            
        }
         for(HashMap.Entry<Integer,Integer>en:total.entrySet()){
            int fr=en.getKey();
            int diff=c1.getOrDefault(fr,0)-(en.getValue()/2);
            for(int i=0;i<Math.abs(diff);i++){
                list.add((long)fr);
            }
         }
            int swaps=list.size()/2;
            Collections.sort(list);
            long cost=0;
            for(int i=0;i<swaps;i++){
               cost+=Math.min(list.get(i),2*min);
            }
            return cost;
        



    }
}
