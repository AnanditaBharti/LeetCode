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
    public TreeNode helpBuildTree(int[] inorder,int startIn, int endIn, int[] postorder, int indexPost){
        if (startIn > endIn || indexPost < 0) {
            return null;
        }
        int val = postorder[indexPost] ;
        TreeNode root = new TreeNode (val) ;
        int splitIndex = -1 ;
        for (int i = startIn; i <= endIn; i++) {
            if (inorder[i] == val){
                splitIndex = i ;
                break;
            }
        }
        // System.out.println(val+","+splitIndex);
        // indexPost--;
        if ( (indexPost - 1 - (endIn - splitIndex )) >= 0)
            System.out.println(val+" - "+ postorder[ indexPost - 1 - (endIn - splitIndex )]);
        root.right = helpBuildTree(inorder, splitIndex + 1, endIn, postorder, indexPost - 1) ;
        // if (root.right != null)
        //     indexPost--;
        root.left = helpBuildTree(inorder, startIn, splitIndex - 1, postorder, indexPost - 1 - (endIn - splitIndex )) ;
        return root;

    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder == null || postorder == null)
            return null;
        return helpBuildTree(inorder, 0, inorder.length - 1, postorder, postorder.length - 1) ;
    }
}