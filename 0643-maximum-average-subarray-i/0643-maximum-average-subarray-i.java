class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE; // Handles all-negative arrays safely

        int left = 0;
        for (int right = 0; right < n; right++) {
            currentSum += nums[right]; // Expand window to the right

            // Once our window hits size k
            if (right - left + 1 == k) {
                maxSum = Math.max(maxSum, currentSum);
                currentSum -= nums[left]; // Remove the leftmost element
                left++;                   // Slide left pointer forward
            }
        }

        // Cast to double at the very end to avoid repeated division & truncation
        return (double) maxSum / k;
    }
}