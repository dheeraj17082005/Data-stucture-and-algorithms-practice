class Solution {
    int dp[];
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        dp = new int[n];
        Arrays.fill(dp,-1);
        int s1 = maxLoot(0,nums,n-2);
        Arrays.fill(dp,-1);
        int s2 = maxLoot(1,nums,n-1);
        return Math.max(s1,s2);
    }
    public int maxLoot(int i,int[] nums,int n){
        if(i>n) return 0;
        if(dp[i]!=-1) return dp[i];
        int pick = nums[i] + maxLoot(i+2,nums,n);
        int skip = maxLoot(i+1,nums,n);
        return dp[i] = Math.max(pick,skip);
    }
}