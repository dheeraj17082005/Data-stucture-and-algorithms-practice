class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        boolean rowmarker[] = new boolean[n];
        boolean colmarker[] = new boolean[m];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(matrix[i][j]==0){
                    rowmarker[i] = true;
                    colmarker[j] = true;
                }
            }
        }
        // turn the rows and col to zero
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(rowmarker[i] || colmarker[j]){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}