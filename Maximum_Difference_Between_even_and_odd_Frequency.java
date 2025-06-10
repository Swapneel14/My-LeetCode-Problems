class Solution {
    public int maxDifference(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        int maxeven=s.length();
        int maxodd=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
        for(char key:map.keySet()){
            int occ=map.get(key);
            if(occ%2==0){
                maxeven=Math.min(occ,maxeven);
            }
            else{
                maxodd=Math.max(occ,maxodd);
            }
        }
        return maxodd-maxeven;
    }
}
