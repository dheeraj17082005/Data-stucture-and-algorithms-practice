class Solution {

    public void swap(int[] nums,int idx,int i){
        int temp = nums[idx];
        nums[idx] = nums[i];
        nums[i] = temp;
    }
    public void getpermutations(int[] nums,  List<List<Integer>> ans,int idx ){

        if(idx == nums.length-1){
           List<Integer> current = new ArrayList<>();
           for(int num : nums){
            current.add(num);
           }
           ans.add(current);

        }
        for(int i = idx; i<nums.length;i++){

            swap(nums,idx,i);

            getpermutations(nums,ans,idx+1);

            // backtracking

            swap(nums,idx,i);

        }
    }
    public List<List<Integer>> permute(int[] nums) {
       List<List<Integer>> ans = new ArrayList<>();
        getpermutations(nums,ans,0);

        return ans;
    }
}