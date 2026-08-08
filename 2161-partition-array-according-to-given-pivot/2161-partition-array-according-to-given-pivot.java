class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] ans = new int[n];
        
        int left = 0;
        int right = n - 1;
        
        // Pass 1: Place elements smaller than pivot from the left
        for (int i = 0; i < n; i++) {
            if (nums[i] < pivot) {
                ans[left++] = nums[i];
            }
        }
        
        // Pass 2: Place elements greater than pivot from the right
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] > pivot) {
                ans[right--] = nums[i];
            }
        }
        
        // Pass 3: Fill the remaining positions with the pivot
        while (left <= right) {
            ans[left++] = pivot;
        }
        
        return ans;
    }
}