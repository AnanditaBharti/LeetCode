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
    int helper(TreeNode root, int x){
        if(root == null)
            return 0;
        int count = 0;
        if(root.val >= x){
            count ++;
            count += helper(root.left, root.val);
            count += helper(root.right, root.val);
        }
        else{
            count += helper(root.left, x);
            count += helper(root.right, x);
        }
        return count;
    }
    public int goodNodes(TreeNode root) {
        return helper(root, root.val);
    }
}