class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            int index = Math.abs(nums[i])-1;
            if(nums[index]>0){
                nums[index]= -nums[index];
            }
        }
        for(int k = 0;k<nums.length;k++){
            if(nums[k]>0){
                ans.add(k+1);
            }
        }
        return ans;
    }
}