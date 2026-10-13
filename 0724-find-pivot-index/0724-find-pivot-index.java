class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int left = 0;
        int totalSum = 0;
        for(int i : nums){
            totalSum+=i;
        }

        for(int i = 0;i<n;i++){
            int right = totalSum - nums[i] - left;

            if(right == left){
                return i;
            }

            left += nums[i];
            
        }
        return -1;
       
    }
}