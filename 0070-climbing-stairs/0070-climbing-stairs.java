class Solution {
    static int dp[];
    public int climbStairs(int n) {
        dp = new int[n+1];
        Arrays.fill(dp,-1);
       return totalSteps(n);
    }
    public int totalSteps(int n){
        if(n==0 || n==1) return 1;
        if(dp[n]!=-1) return dp[n];
        return dp[n] = totalSteps(n-1) + totalSteps(n-2);
    }
}