class BSTIterator {
    private Stack<TreeNode> stack = new Stack<>();
    private boolean reverse; 
    public BSTIterator(TreeNode root, boolean reverse) {
        this.reverse = reverse;
        pushAll(root);
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }

    public int next() {
        TreeNode node = stack.pop();
        if (!reverse) pushAll(node.right);
        else pushAll(node.left);
        return node.val;
    }

    private void pushAll(TreeNode node) {
        while (node != null) {
            stack.push(node);
            if (!reverse) node = node.left;
            else node = node.right;
        }
    }
}

class Solution {
    public boolean findTarget(TreeNode root, int k) {
        if (root == null) return false;
        BSTIterator l = new BSTIterator(root, false);
        BSTIterator r = new BSTIterator(root, true);
        int left = l.next();
        int right = r.next();
        while (left < right) {
            if (left + right == k) return true;
            if (left + right < k) {
                if (l.hasNext()) left = l.next();
                else break;
            } else {
                if (r.hasNext()) right = r.next();
                else break;
            }
        }
        return false;
    }
}