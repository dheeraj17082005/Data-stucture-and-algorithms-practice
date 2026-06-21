class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int dp[][] = new int[m][n];

        for(int j = 0; j<n; j++){
            dp[0][j] = matrix[0][j];
        }

        for(int i = 1; i<m;i++){
            for(int j = 0; j<n;j++){
                int ld = Integer.MAX_VALUE;
                int rd = Integer.MAX_VALUE;

                int st = matrix[i][j] + dp[i-1][j];

               if(j-1 >= 0)  ld = matrix[i][j] + dp[i-1][j-1];

               if(j+1 < m)  rd = matrix[i][j] + dp[i-1][j+1];

               dp[i][j] =  Math.min(st, Math.min(ld,rd));

            }
        }
            int minSum = Integer.MAX_VALUE;
            for (int val : dp[m - 1]) {
            minSum = Math.min(minSum, val);
          }
           return minSum;
        
    }
}