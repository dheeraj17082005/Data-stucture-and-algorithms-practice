class Solution {
    public List<Integer> majorityElement(int[] nums) {
      int n = nums.length;

      HashMap<Integer,Integer> hm = new HashMap<>();

      List<Integer> ans = new ArrayList<>();

      for(int i  = 0;i<n;i++){
        if(hm.containsKey(nums[i])){
            hm.put(nums[i],hm.get(nums[i])+1);
        }
        else{
            hm.put(nums[i],1);
        }
      }
      for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
        int freq = entry.getValue();
        int leastFreq = n/3;

        if(freq>leastFreq){
            ans.add(entry.getKey());
        }
        
      }
      return ans;
    }

    
}