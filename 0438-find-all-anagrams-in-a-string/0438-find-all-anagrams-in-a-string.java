class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        List<Integer> ans = new ArrayList<>();

        if(p == null || s== null || s.length()<p.length()) return ans;
        
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for(int i = 0;i<p.length();i++){
            freq1[p.charAt(i)-'a']++;
            freq2[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(freq1,freq2)) ans.add(0);

        int left = 0;
        for(int right = p.length();right<s.length();right++){
            freq2[s.charAt(right)-'a']++;
            freq2[s.charAt(left)-'a']--;
            left++;

            if(Arrays.equals(freq1,freq2)) ans.add(left);
        }
        return ans;

    }
}