class Solution {
     public static boolean isPallindrome(int i,int j,String s){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
       int right = s.length()-1;
        int left = 0;
        int max = 0;
        for(int i = 0;i<s.length();i++){
            for(int j = i;j<s.length();j++){
                if(isPallindrome(i,j,s)==true){
                     if((j-i+1)>max){
                        max = j-i+1;
                        right = j+1;
                        left = i;
                     }
                }
            }
        }
        return new String(s.substring(left,right));
    }
}