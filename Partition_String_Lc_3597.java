class Solution {
    public List<String> partitionString(String s) {
        List<String> ans = new ArrayList<>();
        Set<String> seen = new HashSet<>();
        
        int prev = 1;
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        String first = sb.toString();
        ans.add(first);
        seen.add(first);

        for (int i = 1; i < s.length(); i++) {
            sb.setLength(0); // reset the StringBuilder

            for (int j = prev; j <= i; j++) {
                sb.append(s.charAt(j));
            }

            String str = sb.toString();
            if (!seen.contains(str)) {
                ans.add(str);
                seen.add(str);
                prev = i + 1;
            }
        }

        return ans;
    }
}
