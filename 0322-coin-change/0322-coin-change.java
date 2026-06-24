class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;

        int dp[][] = new int[n][amount+1];

        for(int[]row : dp){
            Arrays.fill(row,-1);
        }

        int ans = solve(coins,amount,dp,n-1);

        if(ans >= 100000000) return -1;
        else {return ans;}
    }
    public int solve(int[] coins, int target, int[][] dp, int i) {
    if (i == 0) {
        if (target % coins[0] == 0) return (target / coins[0]);
        // else if(target%coins[0] != 0) return -1;
        else return 100000000; 
    }
    
    if (dp[i][target] != -1) return dp[i][target];
    
    int notTake = solve(coins, target, dp, i - 1);
    int take = 100000000;
    
    if (coins[i] <= target) {
        int res = solve(coins, target - coins[i], dp, i);
        if (res != 100000000) { // Only add 1 if the sub-problem was solvable
            take = 1 + res;
        }
    }
    
    return dp[i][target] = Math.min(take, notTake);
}
}