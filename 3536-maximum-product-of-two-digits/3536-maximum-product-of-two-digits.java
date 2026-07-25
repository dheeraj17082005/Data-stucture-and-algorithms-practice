class Solution {
    public int maxProduct(int n) {
        // Convert integer to string to easily access each digit
        String s = Integer.toString(n);
        int maxProd = 0;
        
        // Check every possible pair of distinct digit indices
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                int digit1 = s.charAt(i) - '0';
                int digit2 = s.charAt(j) - '0';
                maxProd = Math.max(maxProd, digit1 * digit2);
            }
        }
        
        return maxProd;
    }
}