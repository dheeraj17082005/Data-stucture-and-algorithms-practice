/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    static int maxi;
    public int maxPathSum(TreeNode root) {
        maxi = Integer.MIN_VALUE;
        levels(root);
        return maxi;
    }
    public int levels(TreeNode root){
        if(root==null) return 0;

        int leftsum = Math.max(levels(root.left),0);

        int rightsum = Math.max(levels(root.right),0);

        maxi = Math.max(maxi,(root.val+leftsum+rightsum));

        return root.val + Math.max(leftsum,rightsum);
    }
}