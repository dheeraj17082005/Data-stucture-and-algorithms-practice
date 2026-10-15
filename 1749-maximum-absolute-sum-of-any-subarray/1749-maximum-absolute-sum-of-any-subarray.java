class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        int min = nums[0];
        int maxAll = Math.abs(nums[0]);
        
        for(int i = 1; i < n; i++){
            max = Math.max(max + nums[i], nums[i]);
            min = Math.min(min + nums[i], nums[i]);
            
            int v1 = Math.abs(max);
            int v2 = Math.abs(min);
            maxAll = Math.max(maxAll, Math.max(v1, v2));
        }
        return maxAll;
    }
}