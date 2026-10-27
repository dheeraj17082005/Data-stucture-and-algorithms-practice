class Solution {
    public String reverseVowels(String s) {
        int n = s.length();

       HashSet<Character> hs = new HashSet<>();
       String vowel = "aeiouAEIOU";
       char[] arr = new char[n];

       for(char ch : vowel.toCharArray()){
          hs.add(ch);
       }

       int left = 0;
       int right = n-1;

       while(left<=right){
        if(hs.contains(s.charAt(left)) && hs.contains(s.charAt(right))){
            arr[left] = s.charAt(right);
            arr[right] = s.charAt(left);
            left++;
            right--;
        }
        else if(!hs.contains(s.charAt(left)) && hs.contains(s.charAt(right))){
            arr[left] = s.charAt(left);
            left++;
        }
        else{
            arr[right] = s.charAt(right);
            right--;
        }
       }

       StringBuilder sb = new StringBuilder();

       for(char ch : arr){
          sb.append(ch);
       }

       return sb.toString();
    }
}