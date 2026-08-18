class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        if (k == 1) {
            int maxVal = -1;
            Map<Integer, Integer> countMap = new HashMap<>();
            for (int num : nums) {
                countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            }
            for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
                if (entry.getValue() == 1) {
                    maxVal = Math.max(maxVal, entry.getKey());
                }
            }
            return maxVal;
        }
        if (k == n) {
            int maxVal = nums[0];
            for (int num : nums) {
                maxVal = Math.max(maxVal, num);
            }
            return maxVal;
        }
        boolean firstUnique = true;
        boolean lastUnique = true;
        
        for (int i = 0; i < n; i++) {
            if (i != 0 && nums[i] == nums[0]) firstUnique = false;
            if (i != n - 1 && nums[i] == nums[n - 1]) lastUnique = false;
        }
        
        int ans = -1;
        if (firstUnique) ans = Math.max(ans, nums[0]);
        if (lastUnique) ans = Math.max(ans, nums[n - 1]);
        
        return ans;
    }
}