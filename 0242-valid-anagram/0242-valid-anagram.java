class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        char[] st = s.toCharArray();
        char[] ls = t.toCharArray();
        Arrays.sort(st);
        Arrays.sort(ls);
        for(int i = 0;i<st.length;i++){
            if(st[i]!=ls[i]) return false;
        }
        return true;

    }
}