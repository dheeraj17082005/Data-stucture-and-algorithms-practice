class Solution {
    public int lengthOfLongestSubstring(String s) {
      int n = s.length();
      if(n==0) return 0;
      HashSet<Character> hs = new HashSet<>();
      hs.add(s.charAt(0));

      int left = 0;
      int maxLen = 1;

      for(int right = 1;right<n;right++){
        // if(s.charAt(left)!=s.charAt(right)){
        //     hs.add(right);
        // }
        while(hs.contains(s.charAt(right))){
            hs.remove(s.charAt(left));
            left++;
        }
        hs.add(s.charAt(right));
        maxLen = Math.max(maxLen,right-left+1);
      }
      return maxLen;

    }
}