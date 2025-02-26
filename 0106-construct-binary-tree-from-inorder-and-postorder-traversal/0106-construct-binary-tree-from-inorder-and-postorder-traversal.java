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
    public TreeNode helpBuildTree(int[] inorder,int startIn, int endIn, int[] postorder, int indexPost, Map<Integer,Integer> mapValueToIndex){
        if (startIn > endIn || indexPost < 0) {
            return null;
        }
        int val = postorder[indexPost] ;
        TreeNode root = new TreeNode (val) ;
        int splitIndex = mapValueToIndex.get(val) ;
        // for (int i = startIn; i <= endIn; i++) {
        //     if (inorder[i] == val){
        //         splitIndex = i ;
        //         break;
        //     }
        // }
        root.right = helpBuildTree(inorder, splitIndex + 1, endIn, postorder, indexPost - 1, mapValueToIndex) ;
        root.left = helpBuildTree(inorder, startIn, splitIndex - 1, postorder, indexPost - 1 - (endIn - splitIndex ), mapValueToIndex) ;
        return root;

    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder == null || postorder == null)
            return null;
        Map<Integer,Integer> mapValueToIndex = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            mapValueToIndex.put(inorder[i],i);
        }
        return helpBuildTree(inorder, 0, inorder.length - 1, postorder, postorder.length - 1, mapValueToIndex) ;
    }
}