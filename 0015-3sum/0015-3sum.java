class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        

        for(int i = 0;i<n-2;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int left = i+1;
            int right = n-1;
            int sum = -1 * nums[i];

            while(left<right){
                int currSum = nums[left]+nums[right];

                if(currSum == sum){
                    List<Integer> ans = new ArrayList<>();

                    ans.add(nums[left]);
                    ans.add(nums[right]);
                    ans.add(nums[i]);
                    res.add(ans);
                    left++;
                    right--;

                        while(left<n && nums[left] == nums[left-1]){
                          left++;
                        }
                        while(right >= 0 && nums[right] == nums[right+1]){
                           right--;
                        }
                }
           
                else if(sum > currSum){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return res;
    }
}