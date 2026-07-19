class Solution {
    public int reverse(int x) {
        long ans = 0;
        int original = x;
        while(Math.abs(original)>0){
            int last = original%10;
            ans = (ans * 10) + last;
            original = original/10;
        }
        if(ans >= 2147483647 || ans < -2147483648) {
            return 0;
        }

        return (int)ans;
    }
}