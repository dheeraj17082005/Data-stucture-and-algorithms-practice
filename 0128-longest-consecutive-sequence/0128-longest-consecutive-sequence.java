class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;

        Set<Integer> numSet = new HashSet<>();
        for(int num : nums){
            numSet.add(num);
        }

        int longest = 0;

        for(int num : nums){

            if(!numSet.contains(num-1)){
                int current = num;
                int streak = 1;

                while(numSet.contains(current+1)){
                    current += 1;
                    streak += 1;

                }
                longest = Math.max(streak,longest);
            }
        }
        return longest;
    }
}