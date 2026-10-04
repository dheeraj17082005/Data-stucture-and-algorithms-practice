class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        boolean[] rowMaker = new boolean[n];
        boolean[] colMaker = new boolean[m];

        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(matrix[i][j]==0){
                    rowMaker[i] = true;
                    colMaker[j] = true;
                }
            }
        }

        // turing the matrix to the expected outcome

        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(rowMaker[i] || colMaker[j]){
                    matrix[i][j] = 0;
                }
            }
        }

    }
}