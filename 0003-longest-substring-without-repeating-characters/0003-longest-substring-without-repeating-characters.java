class Solution {
    public int lengthOfLongestSubstring(String s) {
      int n = s.length();
      if(s.length() == 0 || s == null) return 0;

      HashSet<Character> hs = new HashSet<>();
      

      int left = 0;
      int maxLen = 0;
      for(int right = 0;right<n;right++){
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