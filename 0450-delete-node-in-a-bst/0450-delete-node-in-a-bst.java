
class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return root;
        //leaf node
        if(key<root.val) root.left = deleteNode(root.left,key);
        else if(key>root.val) root.right = deleteNode(root.right,key);
        else{
            //root.val == key
            if(root.left == null && root.right==null){
                return null;
            }
            //single child case
            if(root.left==null) return root.right;
            else if(root.right==null) return root.left;
            else{
                //2 nodes case
                //inorder predecessor
                TreeNode node = findPredecessor(root.left);
                // shift the root.val
                root.val = node.val;
                // delete node.val
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
    // time complexity of this code is H1 + H2 which means h1 is the part to which we initially travelled to find the key node and then h2 is the part from h1 key to. leaf node to later on connect it with the new parent of the child sub tree
}