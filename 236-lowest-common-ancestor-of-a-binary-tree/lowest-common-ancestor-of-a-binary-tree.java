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
    // TreeNode commonAncestor;
    // void dfs(TreeNode root, TreeNode p, TreeNode q, boolean gotP, boolean gotQ){
    //     if(root == null)
    //         return;
    //     if(root.equals(p))
    //         gotP = true;
    //     if(root.equals(q))
    //         gotQ = true;
    //     if(gotP && gotQ){
    //         commonAncestor = root;
    //         return;
    //     }
    //     dfs(root.left, p, q, gotP, gotQ);
    //     dfs(root.right, p, q, gotP, gotQ);
    //     if(gotP && gotQ){
    //         return;
    //     }
    // }

    TreeNode dfs(TreeNode root, TreeNode p, TreeNode q){
        if(root == null)
            return null;
        if(root == p || root == q)
            return root;
        TreeNode left = dfs(root.left, p, q);
        TreeNode right = dfs(root.right, p, q);
        if(left != null && right != null)
            return root;
        if(left == null)
            return right;
        else
            return left;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return dfs(root, p, q);
        // return commonAncestor;
    }
}