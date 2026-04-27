
class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return root;
        if(root.val>key) root.left = deleteNode(root.left,key);
        else if(root.val<key) root.right = deleteNode(root.right,key);
        else{
            //leeaf node case
            if(root.left==null && root.right==null) return null;
            // single node case
            if(root.left==null) return root.right;
            else if(root.right == null) return root.left;
            else{
                // 2 child node case
                TreeNode node = findPredecessor(root.left);
                // shift the value of the predecessor to the node to be deleted
                root.val = node.val;
                // delete the duplicate node on the leaf it will always be a leaf node because the maximum will be at the leaf 
                root.left = deleteNode(root.left,node.val);
            }
        }
        return root;
    }
    public TreeNode findPredecessor(TreeNode node){
        while(node.right!=null){
            node = node.right;
        }
        return node;
    }
}