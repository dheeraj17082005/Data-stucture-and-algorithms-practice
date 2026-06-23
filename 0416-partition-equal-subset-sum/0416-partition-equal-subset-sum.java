class Solution {
    public boolean canPartition(int[] arr) {
        int sum = 0;
        int n = arr.length;
        for(int i : arr){
            sum+= i;
        }
        if(sum % 2 != 0) return false;
        return solve(arr,sum/2,n);
    }
    public boolean solve(int arr[],int target,int n ){
         
         boolean dp[][] = new boolean[n][target+1];
        
        for(int i = 0;i<n;i++){
            dp[i][0] = true;
        }
       if (arr[0] <= target) {
            dp[0][arr[0]] = true;
        }
        
        for(int i = 1;i<n;i++){
            for(int j = 1; j<=target; j++){
                 
                boolean notTake = dp[i-1][j];
        
                boolean take = false;
        
                if(j >= arr[i]){
                   take = dp[i-1][j-arr[i]];
                }
                dp[i][j] = take || notTake;
            }
        }
        return dp[n-1][target];
    }
}