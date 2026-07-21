class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        int sum = 0;
        int row = 0;
        int col = 0;
       // primary diagonal
        while(row<n && col < m){
            sum += mat[row][col];
            row++;
            col++;
        }
        // secondary diagonal
        row = 0;
        col = m-1;
        while(row<n && col>=0){
            if(row!=col){
            sum+=mat[row][col];
            }
            row++;
            col--;
        }
        return sum;
    }
}