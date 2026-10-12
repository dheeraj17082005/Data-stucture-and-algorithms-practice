class Solution {
    public boolean isAnagram(String s, String t) {
      if(s.length()!=t.length()) return false;

      HashMap<Character,Integer> hm = new HashMap<>();

      for(char ch : s.toCharArray()){
        if(hm.containsKey(ch)){
            hm.put(ch,hm.get(ch)+1);
        }
        else{
            hm.put(ch,1);
        }
      }

      for(char ch : t.toCharArray()){
        if(!hm.containsKey(ch) || hm.get(ch)==0){
            return false;
        }
        else hm.put(ch,hm.get(ch)-1);
      }
      return true;
    }
}