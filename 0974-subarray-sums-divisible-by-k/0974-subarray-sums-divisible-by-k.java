class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n = nums.length;

        HashMap<Integer,Integer> hm = new HashMap<>();

        hm.put(0,1);

        int maxLen = 0;
        int sum = 0;

        for(int i = 0;i<n;i++){
            sum += nums[i];

            int mod = sum % k;

            if(mod < 0){
                mod += k;
            }

            if(hm.containsKey(mod)){
                maxLen += hm.get(mod);
            }

            hm.put(mod,hm.getOrDefault(mod,0)+1);
        }
        return maxLen;
    }
}