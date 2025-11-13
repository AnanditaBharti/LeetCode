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
    List<Integer> ans = new ArrayList<>();
    public void bfs(List<TreeNode> currLevelNodes){
        if(currLevelNodes.isEmpty())
            return;
        List<TreeNode> nextLevelNodes = new ArrayList<>();
        TreeNode rightMost = null;
        for(TreeNode t: currLevelNodes){
            // if(t == null)
            //     continue;
            rightMost = t;
            if(t.left != null){
                nextLevelNodes.add(t.left);
            }
            if(t.right != null){
                nextLevelNodes.add(t.right);
            }
        }
        if(rightMost != null)
            ans.add(rightMost.val);
        bfs(nextLevelNodes);
    }
    public List<Integer> rightSideView(TreeNode root) {
        if(root == null)
            return new ArrayList<>();
        List<TreeNode> currLevelNodes = new ArrayList<>();
        currLevelNodes.add(root);
        bfs(currLevelNodes);
        return ans;
    }
}