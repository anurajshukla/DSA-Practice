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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        path(root);
        return isSum(root, targetSum);
    }
    
    public boolean isSum(TreeNode root, int targetSum) {
        if(root == null) { return false; }
        if(root.right == null && root.left == null) {
            if(root.val == targetSum) { return true; }
        }
        return isSum(root.left, targetSum) || isSum(root.right, targetSum);
    }
    
    public static void path(TreeNode root){
        if(root==null)
        return;
        int data = root.val;
        if(root.left!=null)
        root.left.val += data;

        if(root.right!=null)
        root.right.val += data;

        path(root.left);
        path(root.right);
    }
    
}