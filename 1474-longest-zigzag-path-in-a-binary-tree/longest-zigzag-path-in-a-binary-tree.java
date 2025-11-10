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
    int maxLen = 0;
    int[] dfs(TreeNode root){
        if(root == null)
            return new int[]{-1, -1};
        int[] leftZig = dfs(root.left);
        int[] rightZag = dfs(root.right);

        int leftMax = leftZig[1] + 1;
        int rightMax = rightZag[0] + 1;

        maxLen = Math.max(maxLen, Math.max(leftMax, rightMax));

        return new int[]{leftMax, rightMax};
    }
    
    public int longestZigZag(TreeNode root) {
        dfs(root);
        return maxLen;
    }
}