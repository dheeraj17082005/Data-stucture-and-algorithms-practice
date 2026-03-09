class Solution {
    public int uniquePaths(int m, int n) {
        // Total steps = (m-1) + (n-1)
        int N = m + n - 2;
        // We choose the smaller of the two to minimize iterations
        int r = Math.min(m - 1, n - 1); 
        
        long res = 1;

        // Efficiently calculating NCr: (N * N-1 * ... * N-r+1) / (1 * 2 * ... * r)
        for (int i = 1; i <= r; i++) {
            // Multiply first, then divide to maintain precision
            // We use long to prevent overflow during the multiplication step
            res = res * (N - r + i) / i;
        }

        return (int) res;
    }
}
