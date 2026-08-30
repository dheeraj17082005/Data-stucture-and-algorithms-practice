class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        if (n == 1) return 1;
        
        int minIdx = 0, maxIdx = 0;
        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[minIdx]) minIdx = i;
            if (nums[i] > nums[maxIdx]) maxIdx = i;
        }
        int i = Math.min(minIdx, maxIdx);
        int j = Math.max(minIdx, maxIdx); 
        int opt1 = j + 1;        
        int opt2 = n - i;              
        int opt3 = (i + 1) + (n - j);   
        return Math.min(opt1, Math.min(opt2, opt3));
    }
}