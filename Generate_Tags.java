class Solution {
    public String generateTag(String caption) {
        StringBuilder ans= new StringBuilder("#");
        boolean space=false;
        boolean first=true;
        for(char ch: caption.toCharArray()){
            if(first){
                if(Character.isLetter(ch)){
                    ans.append(Character.toLowerCase(ch));
                    first=false;
                }
                continue;

                }
                if(ch==' '){
                    space=true;
                    continue;
                }
                if(space){
                    ans.append(Character.toUpperCase(ch));
                    space=false;
                }
                else{
                    ans.append(Character.toLowerCase(ch));
                }
            }
            if(ans.length()>100)return ans.substring(0,100);
            return ans.toString();
        }
    }
