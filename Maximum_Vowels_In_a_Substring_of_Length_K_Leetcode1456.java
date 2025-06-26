class Solution {
    public int maxVowels(String s, int k) {
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
        int n=s.length();
       
        int curr=0,max=0;
       
            for(int m=0;m<=k-1;m++){
                if(vowels.contains(s.charAt(m))) curr++;
            }
            max=Math.max(curr,max);
        for(int i=k;i<n;i++){
            if(vowels.contains(s.charAt(i-k)))curr--;
            if(vowels.contains(s.charAt(i)))curr++;
            max=Math.max(curr,max);
        }
        return max;

    }
}
