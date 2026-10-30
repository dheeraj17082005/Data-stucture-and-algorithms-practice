class Solution {
    public int minimumDifference(int[] nums, int k) {
        int n = nums.length;

        Arrays.sort(nums);

        if(k==1) return 0;
        int diff= Integer.MAX_VALUE;
        for(int i=0;i<=n-k;i++){
            int curr=nums[i+k-1]-nums[i];
            diff=Math.min(curr,diff);
        }

        
            

        
        return diff;


        

    }
}