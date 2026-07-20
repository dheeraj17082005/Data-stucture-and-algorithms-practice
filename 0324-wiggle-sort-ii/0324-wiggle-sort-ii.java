class Solution {
    public void wiggleSort(int[] nums) {
        int n = nums.length;

        int[] naya = new int[n];

        Arrays.sort(nums);

        int j = n-1;
        int i = 1;

        while(i<n){
            naya[i] = nums[j];
            i = i+2;
            j--;
        }
        i = 0;
        while(i<n){
           naya[i] = nums[j];
           j--;
           i = i+2;
        }

        for(int k = 0;k<n;k++){
            nums[k] = naya[k];
        }
    }
}