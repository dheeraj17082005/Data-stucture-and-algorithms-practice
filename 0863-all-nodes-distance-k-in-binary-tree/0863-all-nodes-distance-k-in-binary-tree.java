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
    public void tracker(TreeNode root, Map<TreeNode,TreeNode> track_parents){
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode current = q.poll();
            if(current.left!=null){
                track_parents.put(current.left,current);
                q.add(current.left);
            }
            if(current.right!=null){
                track_parents.put(current.right,current);
                q.add(current.right);
            }
        }
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode,TreeNode> track_parents = new HashMap<>();
        tracker(root,track_parents);
        Map<TreeNode,Boolean> visited = new HashMap<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(target);
        visited.put(target,true);
        int curr_level = 0;
        while(!q.isEmpty()){
            int size = q.size();
            if(curr_level == k) break;
            curr_level++;
            for(int i = 0;i<size;i++){
                TreeNode current = q.poll();
                if(current.left!=null && visited.get(current.left) == null){
                    q.add(current.left);
                    visited.put(current,true);
                } 
                if(current.right!=null && visited.get(current.right) == null){
                    q.add(current.right);
                    visited.put(current,true);
                } 
                if(track_parents.get(current)!= null && visited.get(track_parents.get(current))==null){
                    q.add(track_parents.get(current));
                    visited.put(track_parents.get(current),true);
                }
            }
        }
        List<Integer> ans = new ArrayList<>();
        while(!q.isEmpty()){
            TreeNode current = q.poll();
            ans.add(current.val);
        }
        return ans;
    }
}