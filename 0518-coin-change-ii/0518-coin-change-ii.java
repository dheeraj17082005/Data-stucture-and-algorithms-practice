class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length;

        int dp[][] = new int[n][amount+1];

        for(int[]row : dp){
            Arrays.fill(row,-1);
        }

        return solve(coins,amount,dp,n-1);

        // if(ans >= 100000000) return -1;
        // else {return ans;}
    }
    public int solve(int[] coins, int target, int[][] dp, int i) {
    if (i == 0) {
        if (target % coins[0] == 0) return 1;
        // else if(target%coins[0] != 0) return -1;
        else return 0; 
    }
    
    if (dp[i][target] != -1) return dp[i][target];
    
    int notTake = solve(coins, target, dp, i - 1);
    int take = 0;
    
    if (coins[i] <= target) {
        take = solve(coins, target - coins[i], dp, i);
    }
    
    return dp[i][target] = take + notTake;


    }
}

  
        