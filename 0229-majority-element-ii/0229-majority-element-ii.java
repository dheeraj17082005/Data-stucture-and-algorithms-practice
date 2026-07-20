class Solution {
    public List<Integer> majorityElement(int[] nums) {
       int n = nums.length;

       int count1 = 0;
       int count2 = 0;
       int cand1 = -1;
       int cand2 = -1;

       ArrayList<Integer> ans = new ArrayList<>();
       
       for(int num : nums){
        if(cand1 == num){
            count1++;
        }
        else if(cand2 == num){
            count2++;
        }
        else if(count1 == 0){
            cand1 = num;
            count1 = 1;
        }
        else if(count2 == 0){
            cand2 = num;
            count2 = 1;
        }
        else{
            count1--;
            count2--;

        }
       }

       count1 = 0;
       count2 = 0;
       for(int num : nums){
        if(cand1 == num) count1++;
        else if(cand2 == num) count2++;
       }
       if(count1>n/3) ans.add(cand1);
       if(count2>n/3) ans.add(cand2);

    return ans;
    }

    
}