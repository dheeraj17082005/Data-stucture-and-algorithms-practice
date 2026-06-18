class Solution {
    
    public int minCostClimbingStairs(int[] nums) {
       int n = nums.length;
       int dp[] = new int[n+1];
       if(n==0) return 0;
       if(n==1) return nums[0];
       dp[0] = 0;
       dp[1] = 0;
       for(int i = 2;i<=n;i++){
        dp[i] = Math.min(nums[i-1]+dp[i-1],nums[i-2]+dp[i-2]);
       }
       return dp[n];

    }
}