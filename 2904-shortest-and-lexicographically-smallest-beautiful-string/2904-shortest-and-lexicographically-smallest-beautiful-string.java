class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        String ans = "";
        int n = s.length();
        
        for (int i = 0; i < n; i++) {
            int count = 0;
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < n; j++) {
                sb.append(s.charAt(j));
                if (s.charAt(j) == '1') {
                    count++;
                }
                
                if (count == k) {
                    if (ans.equals("") || sb.length() < ans.length() || 
                        (sb.length() == ans.length() && sb.toString().compareTo(ans) < 0)) {
                        ans = sb.toString();
                    }
                    break;
                }
            }
        }
        return ans;
    }
}