/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || p == root || q==root) return root;
        TreeNode left = lowestCommonAncestor( root.left,  p, q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        ///////////// keep in mind dheeraj if left is nul you have to take right and if right is null you have to take left and if both is null then congrats you got your LCA.
        if(left==null){
            return right;
        }
        else if(right == null){
            return left;
        }
        else{
            return root;
        }
    }
}