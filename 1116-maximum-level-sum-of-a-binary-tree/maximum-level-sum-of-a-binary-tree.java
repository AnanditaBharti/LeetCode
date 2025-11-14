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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> bfs = new LinkedList<>();
        bfs.add(root);

        int maxSum = Integer.MIN_VALUE;
        int currLevel = 0;
        int maxSumLevel = 0;
        
        while(! bfs.isEmpty()){
            int size = bfs.size();
            currLevel ++;
            int currSum = 0;
            for(int i = 0; i < size; i ++){
                TreeNode node = bfs.remove();
                if(node.left != null)
                    bfs.add(node.left);
                if(node.right != null)
                    bfs.add(node.right);
                currSum += node.val;
            }
            if(currSum > maxSum){
                maxSum = currSum;
                maxSumLevel = currLevel;
            }
        }
        return maxSumLevel;
    }
}