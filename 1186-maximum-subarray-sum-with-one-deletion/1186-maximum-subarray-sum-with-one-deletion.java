class Solution {
    public int maximumSum(int[] nums) {
        int n = nums.length;

        int oneDelete = Integer.MIN_VALUE;

        int noDelete = nums[0];

        int max = nums[0];

        for(int i = 1 ; i<n ; i++){
            int prevnoDelete = noDelete;
            int prevoneDelete = oneDelete;

            noDelete = Math.max(noDelete+nums[i],nums[i]);

            int v2;

            if(oneDelete == Integer.MIN_VALUE){
                 v2 = nums[i];
            }

            else{
                v2 = prevoneDelete + nums[i];
            }

            oneDelete = Math.max(prevnoDelete,v2);
  
            max = Math.max(max,Math.max(oneDelete,noDelete));
        }
        return max;
    }
}