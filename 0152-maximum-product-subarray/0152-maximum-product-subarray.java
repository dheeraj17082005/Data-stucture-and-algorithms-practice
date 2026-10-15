class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;

        int currProduct = nums[0];

        int maxProduct = nums[0];

        int minProduct = nums[0];

        for(int i = 1; i<n; i++){
            int v1 = nums[i];
            int v2 = nums[i] * currProduct;
            int v3 = nums[i] * minProduct;

            currProduct = Math.max(v1,Math.max(v2,v3));

            minProduct = Math.min(v1,Math.min(v2,v3));

            maxProduct = Math.max(maxProduct, Math.max(minProduct,currProduct));
        }
        return maxProduct;
    }
}