class Solution {
    public int beautySum(String s) {
        int totalBeauty = 0;
        int n = s.length();

        // Fix the starting point of the substring
        for (int i = 0; i < n; i++) {
            int[] freq = new int[26]; // Frequency array for lowercase English letters
            
            // Fix the ending point of the substring
            for (int j = i; j < n; j++) {
                freq[s.charAt(j) - 'a']++;

                // Find max and min frequencies for the current substring
                int maxFreq = 0;
                int minFreq = Integer.MAX_VALUE;

                for (int k = 0; k < 26; k++) {
                    if (freq[k] > 0) {
                        maxFreq = Math.max(maxFreq, freq[k]);
                        minFreq = Math.min(minFreq, freq[k]);
                    }
                }

                // Add beauty of the current substring to total
                totalBeauty += (maxFreq - minFreq);
            }
        }

        return totalBeauty;
    }
}