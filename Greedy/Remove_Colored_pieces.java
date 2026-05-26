class Solution {
    public boolean winnerOfGame(String colors) {
        int n = colors.length();

        int alice=0,bob=0;

        for(int i = 1 ; i < n-1 ; i++){
            char ch = colors.charAt(i);
            if(ch=='A'&&colors.charAt(i-1)=='A'&&colors.charAt(i+1)=='A')alice++;
            else if(ch=='B'&&colors.charAt(i-1)=='B'&&colors.charAt(i+1)=='B')bob++;
        }

        return alice>bob;

    }
}
