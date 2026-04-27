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
    static int sum ;
    public int rangeSumBST(TreeNode root, int low, int high) {
        sum = 0;
        rangeSum(root,low,high);
        return sum;
    }
    public void rangeSum(TreeNode root, int low, int high){
        if(root==null) return ;
        if(root.val >= low && root.val <= high ){
            sum+=root.val;
        }
        rangeSum(root.left,low,high);
        rangeSum(root.right,low,high);
    }
}