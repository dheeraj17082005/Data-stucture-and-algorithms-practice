class Solution {
    public int characterReplacement(String s, int k) {

        int[] freq = new int[26];

        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            freq[s.charAt(right) - 'A']++;

            
            maxFreq = Math.max(
                maxFreq,
                freq[s.charAt(right) - 'A']
            );

            
            int windowLength = right - left + 1;
            int replacements = windowLength - maxFreq;

            if (replacements > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
//     class Solution {
//     public int characterReplacement(String s, int k) {
//        int n = s.length();
//        int[] freq = new int[26];
//        int maxFreq = 0;
//        int maxLen = 0;;
//        int left = 0;
      
//        for(int right = 0;right<n;right++){

//           freq[s.charAt(right) -'A']++;
          
//           maxFreq = Math.max(maxFreq,freq[s.charAt(right)-'A']);

//          int replacement = (right-left+1)-maxFreq;

//          while(replacement > k){
//             freq[s.charAt(left)-'A']--;
//             left++;
//          }
//          maxLen = Math.max(maxLen,right-left+1);

//        }
//        return maxLen;
        
//     }
// }
}