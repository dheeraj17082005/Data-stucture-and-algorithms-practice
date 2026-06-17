class Solution {
    
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        int s1 = maxLoot(0,nums,n-2);
        int s2 = maxLoot(1,nums,n-1);
        return Math.max(s1,s2);
    }
    public int maxLoot(int start,int[] nums,int n){
        int size = n - start+1;
        if (size <= 0) return 0;
        if (size == 1) return nums[start];
        int dp[] = new int[size];
        dp[0] = nums[start];
        dp[1] = Math.max(nums[start],nums[start+1]);
        for(int i = 2;i<size;i++){
            dp[i] = Math.max(dp[i-1],dp[i-2]+nums[start+i]);
        }
        return dp[size-1];
    }
   
}