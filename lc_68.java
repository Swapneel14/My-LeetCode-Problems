class Solution {

    private String findline(String[] words, int max ,int i,int j,int seg_len,int extra ){
        StringBuilder sb = new StringBuilder();
        for(int k = i; k < j; k++){
        sb.append(words[k]);

        if(k == j - 1) break; // last word → no extra space here

        int spacesToAdd = seg_len;
        if(extra > 0){
            spacesToAdd += 1;
            extra--;
        }

        sb.append(" ".repeat(spacesToAdd));
    }

        int len = sb.length();
        sb.append(" ".repeat(max-len));

        return sb.toString();
    }

    public List<String> fullJustify(String[] words, int max) {

        int n = words.length;
        int i=0;
        List<String>ans=new ArrayList<>();
        while(i<n){
            int letters=words[i].length();
            int spaces=0;
            int j=i+1;
            while(j<n&&letters+words[j].length()+spaces+1<=max){
                 letters+=words[j].length();
                 spaces+=1;
                 j++;
            }
            int total_spaces=max-letters;
            int seg_len=spaces==0?0:total_spaces/spaces;
            int extra=spaces==0?0:total_spaces%spaces;

            if(j==n){
                seg_len=1;
                extra=0;
            }
            ans.add(findline(words,max,i,j,seg_len,extra));
            i=j;

        }

        return ans;
        
    }
}
