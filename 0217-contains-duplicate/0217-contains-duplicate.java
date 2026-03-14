class Solution {  
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = i+1;
        Arrays.sort(nums);
        while(j<n){
            if(nums[i]==nums[j]) return true;
            else i = j;
            j++;
        }
       return false;
    }

}