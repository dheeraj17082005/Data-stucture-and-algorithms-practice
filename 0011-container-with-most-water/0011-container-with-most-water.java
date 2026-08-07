class Solution{
    public int maxArea(int[]nums){
        int n = nums.length;
        int area = 0;
        int maxArea = 0;
        int left = 0;
        int right = n-1;
        while(left<=right){
            int containerHeight = Math.min(nums[left],nums[right]);
            int breadth = Math.abs(right-left);
            maxArea = containerHeight * breadth;
            area = Math.max(maxArea,area);
            if(nums[left]<=nums[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return area;
    }
}