class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Integer>fors=new HashMap<>();
        HashMap<Character,Integer>fort=new HashMap<>();
        for(int i=0;i<s.length();i++){
   char s1=s.charAt(i);
   char t1=t.charAt(i);
   if(!fors.containsKey(s1))fors.put(s1,i);
   if(!fort.containsKey(t1))fort.put(t1,i);
   if(fors.get(s1)!=fort.get(t1))return false;


        }
        return true;

    }
}
