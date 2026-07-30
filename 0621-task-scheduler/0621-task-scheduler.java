class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        int maxFreq = 0;
        
        // Step 1: Count frequencies of each task
        for (char task : tasks) {
            freq[task - 'A']++;
            maxFreq = Math.max(maxFreq, freq[task - 'A']);
        }
        
        // Step 2: Count how many tasks have the maximum frequency
        int countMax = 0;
        for (int f : freq) {
            if (f == maxFreq) {
                countMax++;
            }
        }
        
        // Step 3: Calculate the minimum intervals using the greedy formula
        int partCount = maxFreq - 1;
        int emptySlots = partCount * (n - (countMax - 1)); // simplified as below
        
        // General formula: (maxFreq - 1) * (n + 1) + countMax
        int ans = (maxFreq - 1) * (n + 1) + countMax;

        return Math.max(ans, tasks.length);
    }
}