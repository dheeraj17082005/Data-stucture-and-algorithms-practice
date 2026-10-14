class Solution {
    public int findMaxLength(int[] nums) {
       int n = nums.length;

       int zero = 0;
       int one = 0;
       int res = 0;

       HashMap<Integer,Integer> hm = new HashMap<>();

       for(int i = 0;i<n;i++){
        if(nums[i]==1){
            one++;
        }
        else zero++;

        int diff = zero - one;

        if(diff == 0){
            res = Math.max(res,i+1);

        }

        if(hm.containsKey(diff)){
            res = Math.max(res,i - hm.get(diff));
        }
        else{
            hm.put(diff,i);
        }

       }
       return res;
    }
}