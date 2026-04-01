class Solution {
    public int[] sortEvenOdd(int[] nums) {
      int n = nums.length;
      ArrayList<Integer> arr1 = new ArrayList<>();
      ArrayList<Integer> arr2 = new ArrayList<>();
     for (int i = 0; i < n; i++) {
       if (i % 2 != 0) {
         arr1.add(nums[i]); // Values at Odd Indices
     }  else {
        arr2.add(nums[i]); // Values at Even Indices
     }
   }

      Collections.sort(arr2);
      Collections.sort(arr1, Collections.reverseOrder());
      int oddidx = 0;int evenidx = 0;
      for(int i = 0;i<n;i++){
        if(i%2==0) {
            nums[i] = arr2.get(evenidx++);
        }
        else nums[i] = arr1.get(oddidx++);
      }
      return nums;

    }
}