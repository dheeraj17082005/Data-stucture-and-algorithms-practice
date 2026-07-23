class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat == null || mat.length == 0) {
            return new int[0];
        }

        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m * n];
        
        int r = 0, c = 0;
        boolean goingUp = true;

        for (int i = 0; i < m * n; i++) {
            result[i] = mat[r][c];

            if (goingUp) {
                if (c == n - 1) {
                    r++;
                    goingUp = false;
                } else if (r == 0) {
                    c++;
                    goingUp = false;
                } else {
                    r--;
                    c++;
                }
            } else {
                if (r == m - 1) {
                    c++;
                    goingUp = true;
                } else if (c == 0) {
                    r++;
                    goingUp = true;
                } else {
                    r++;
                    c--;
                }
            }
        }

        return result;
    }
}