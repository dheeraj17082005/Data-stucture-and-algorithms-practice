class Solution {
    public int countHillValley(int[] nums) {
        int n = nums.length;
        int j = 0;
        int count = 0;
        for(int i = 1;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                continue;
            }
            if(nums[i]>nums[j]&&nums[i]>nums[i+1]) count++;
            else if(nums[i]<nums[j]&&nums[i]<nums[i+1]) count++;
            j=i;
        }
        return count;
    }
}