class Solution {
    public void swap(int[] nums,int i,int idx){
        int temp = nums[i];
        nums[i] = nums[idx];
        nums[idx] = temp;
    }
    public void reverse(int[] nums,int start,int end){
        while(start<=end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int idx = -1;
        for(int i = n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                idx = i;
                break;
            }
        }
        if(idx!=-1){
            for(int i = n-1;i>=idx;i--){
                if(nums[i]>nums[idx]){
                    swap(nums,idx,i);
                    break;
                }
            }
        }
        reverse(nums,idx+1,n-1);
    }
}