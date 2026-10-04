class Solution {
    public int reverse(int x) {
       
        long reverse = 0;
        int original = x;
        while(Math.abs(original)>0){
            int digit = original%10;
            reverse = reverse * 10 + digit;
            original = original / 10;
        }
        if(reverse>=2147483647 || reverse <  -2147483648){
            return 0;
        }
        return (int)reverse;
    }
}