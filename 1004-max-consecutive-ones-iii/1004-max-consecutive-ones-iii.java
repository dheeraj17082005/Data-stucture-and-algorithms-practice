class Solution {
    public int longestOnes(int[] arr, int k) {
        int n = arr.length;
        int maxLen = 0;
        int zeroes = 0;
        int left = 0;

        for(int right = 0;right<n;right++){
            if(arr[right]==0){
                zeroes++;
            }

            while(zeroes>k){
                if(arr[left]==0){
                    zeroes--;
                }
                left++;
            }
            maxLen = Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }
}