class Solution {
    public int subarraySum(int[] nums, int k) {
       int n = nums.length;

       HashMap<Integer,Integer> hm = new HashMap<>();
       hm.put(0, 1);
       int sum = 0;
       int freq = 0;

       for(int i = 0;i<n;i++){
         sum += nums[i];
        int remaining = (sum-k);

        if(hm.containsKey(remaining)){
            freq += hm.get(remaining);
        }
        hm.put(sum,hm.getOrDefault(sum,0)+1);

        
       }
       return freq;
      
    }
}