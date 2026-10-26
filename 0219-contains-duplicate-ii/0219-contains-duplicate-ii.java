class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;

        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i : nums){
           hm.put(i,hm.getOrDefault(i,0)+1);
        }

        for(int i = 0;i<n-1;i++){
            if(hm.get(nums[i])>1){
                for(int j = i+1;j<n;j++){
                    int ab = Math.abs(i-j);
                    if(nums[i]==nums[j] && ab <= k) return true;
                }
            }
        }
        return false;
    }
}