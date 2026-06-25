class Solution {
    public int minDistance(String word1, String word2) {
        int deletions = word1.length() - longestCommonSubsequence(word1,word2);
        int insertions = word2.length() - longestCommonSubsequence(word1,word2);

        return deletions + insertions;
    }
     public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();

        int dp[][] = new int[n][m];

        for(int[] row : dp) Arrays.fill(row,-1);

        return solve(text1,text2,n-1,m-1,dp);
    }
    public int solve(String text1, String text2, int i,int j,int[][] dp){
        if(i < 0 || j < 0) return 0;

        if(dp[i][j] != -1) return dp[i][j];

        if(text1.charAt(i) == text2.charAt(j)){
            return dp[i][j] = 1 + solve(text1,text2,i-1,j-1,dp);
        }

        return dp[i][j] = 0 + Math.max(solve(text1,text2,i,j-1,dp),solve(text1,text2,i-1,j,dp));

    }
}