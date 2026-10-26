class Solution {
    public int findLHS(int[] nums) {
        int n = nums.length;
        
        Arrays.sort(nums);

        int left = 0;
        int res = 0;

        for(int right = 0;right<n;right++){
            int diff = Math.abs(nums[right]-nums[left]);
            if(diff == 1){
                res = Math.max(res,right-left+1);
            }
            while(diff>1){
                left++;
                diff = Math.abs(nums[right]-nums[left]);
            }
        }
        return res;


    }
}