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
    long dfs(TreeNode root, int targetSum, long currSum){
        if(root == null){
            return 0;
        }
        int count = 0;
        currSum += root.val;
        if(currSum == targetSum)
            count = 1;
        count += dfs(root.left, targetSum, currSum);
        count += dfs(root.right, targetSum, currSum);
        return count;
    }
    // int helper()
    public int pathSum(TreeNode root, int targetSum) {
        // TreeNode temp = root;
        if(root == null){
            return 0;
        }
        int count = 0;
        count += dfs(root, targetSum, 0);
        count += pathSum(root.left, targetSum);
        count += pathSum(root.right, targetSum);
        return count;
    }
}