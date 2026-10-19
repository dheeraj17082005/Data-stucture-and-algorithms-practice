class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        
        if (m > n) return -1;
        
        // Loop through haystack up to the point where needle can still fit
        for (int i = 0; i <= n - m; i++) {
            int j = 0;
            // Check if the substring matches needle
            while (j < m && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            // If we matched the entire needle, return the starting index i
            if (j == m) {
                return i;
            }
        }
        
        return -1;
    }
}