class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = get(n);

        while(fast != 1 && fast!=slow){
            slow = get(slow);
            fast = get(get(fast));
        }
        return fast == 1;
    }
    public int get(int n){
        int totalSum = 0;

        while(n>0){
            int digit = n%10;
            totalSum += digit * digit;
            n = n/10;
        }
        return totalSum;
    }
}