class Solution {
    public String finalString(String s) {
    
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch != 'i') {
                sb.append(ch);
            } else {
                sb.reverse();  // in-place reverse, no extra space
            }
        }

        return sb.toString();
    }
}

   
