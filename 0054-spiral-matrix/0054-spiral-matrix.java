class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return ans;
        int n = matrix.length;
        int m = matrix[0].length;
        int top = 0;
        int bottom = n-1;
        int right = 0;
        int left = m-1;

        while(top<=bottom && right<=left){

            for(int col = right;col<=left;col++){
                ans.add(matrix[top][col]);
            }
            top++;
            for(int row = top; row<=bottom;row++){
                 ans.add(matrix[row][left]);
            }
            left--;
            if(top<=bottom){
                for(int col = left;col>=right;col--){
                ans.add(matrix[bottom][col]);
            }
            bottom--;
            }
            
            if(right<=left){
                for(int row=bottom;row>=top;row--){
                ans.add(matrix[row][right]);
            }

            
            right++;
            }
        }
        return ans;
    }
}