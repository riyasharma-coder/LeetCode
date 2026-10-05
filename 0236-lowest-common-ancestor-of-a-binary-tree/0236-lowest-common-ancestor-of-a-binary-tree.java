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
        if(root == null || root == p || root == q){
            return root;
        }

        TreeNode lefty = lowestCommonAncestor(root.left, p, q);
        TreeNode righty = lowestCommonAncestor(root.right, p, q);

        if(lefty!=null && righty!=null){
            return root;
        }

        return lefty==null? righty : lefty;
    }
}