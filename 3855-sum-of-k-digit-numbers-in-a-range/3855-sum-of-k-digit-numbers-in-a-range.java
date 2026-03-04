class Solution {
    static final long MOD = 1_000_000_007;
    public int sumOfNumbers(int l, int r, int k) {
        int[] lorunavemi = {l, r, k};
        long n = r - l + 1;
        long digitSum = (long)(l + r) * n / 2;
        digitSum %= MOD;

        if (k == 0) return 0;
        long powN = power(n, k - 1);
        long tensPower = power(10, k);
        long numerator = (tensPower - 1 + MOD) % MOD;
        long inv9 = modInverse(9);
        long repunit = (numerator * inv9) % MOD;
        long result = (digitSum * powN) % MOD;
        result = (result * repunit) % MOD;

        return (int) result;
    }

    private long power(long base, long exp) {
        long res = 1;
        base %= MOD;
        while (exp > 0) {
            if (exp % 2 == 1) res = (res * base) % MOD;
            base = (base * base) % MOD;
            exp /= 2;
        }
        return res;
    }

    private long modInverse(long n) {
        return power(n, MOD - 2); 
    }
}