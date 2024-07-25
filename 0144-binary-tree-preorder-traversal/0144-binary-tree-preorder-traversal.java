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
    public List<Integer> preorderTraversal(TreeNode root) {
       List<Integer> output = new ArrayList<Integer>();
       if(root == null){
        return output;
       } 
       output.add(root.val);
       output.addAll(preorderTraversal(root.left));
       output.addAll(preorderTraversal(root.right));
       return output;
    }
}