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
    public boolean isLeaf(TreeNode root)
    {
        if(root==null)
           return false;
        if(root.left==null && root.right==null)
           return true;
        return false;
    }
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null)
           return 0;
        int x=0;
        if(root.left!=null && isLeaf(root.left))
        {
            x+=root.left.val;
        }
        else
        {
            x+=sumOfLeftLeaves(root.left);
        }
        x+=sumOfLeftLeaves(root.right);
        return x;
    }
}