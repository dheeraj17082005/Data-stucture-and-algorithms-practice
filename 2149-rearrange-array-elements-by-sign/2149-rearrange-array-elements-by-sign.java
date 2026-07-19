class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();
        for(int num : nums){
            if(num<0) negative.add(num);
        }
         for(int num : nums){
            if(num>0) positive.add(num);
        }

        int[] ans = new int[nums.length];
        int i = 0,j = 0,k = 0;
        while(k<nums.length){
            if(k%2 == 0) {
                ans[k] = positive.get(i);
                i++;
            }
            else{
                ans[k] = negative.get(j);
                j++;
            }
            k++;
        }
        return ans;
    }
}