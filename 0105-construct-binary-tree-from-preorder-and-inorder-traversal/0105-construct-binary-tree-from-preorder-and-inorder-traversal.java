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
    TreeNode buildTreeHelper (int[] preorder, int[] inorder, int preorderIndex, int inorderStartIndex, int inorderEndIndex, Map<Integer,Integer> inorderValueIndexMap) {
        if (preorderIndex > preorder.length-1 || inorderStartIndex > inorderEndIndex)
            return null;
        int node = preorder[preorderIndex];
        TreeNode root = new TreeNode(node);
        root.left = buildTreeHelper(preorder, inorder, preorderIndex+1, inorderStartIndex, inorderValueIndexMap.get(node)-1, inorderValueIndexMap);
        root.right = buildTreeHelper(preorder, inorder, preorderIndex + 1 + inorderValueIndexMap.get(node) - inorderStartIndex, inorderValueIndexMap.get(node)+1, inorderEndIndex, inorderValueIndexMap);
        return root;
    } 
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer,Integer> inorderValueIndexMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inorderValueIndexMap.put(inorder[i], i);
        }
        return buildTreeHelper(preorder, inorder, 0, 0, inorder.length-1, inorderValueIndexMap);
        // Deque<TreeNode> stack = new ArrayDeque<>();
        // for (int i: preorder) {
        //     stack.push(new TreeNode(i, null, null));
        // }
        // TreeNode left = null;
        // TreeNode right = null;
        // TreeNode parent = null;
        // TreeNode root = null;
        // while(!stack.isEmpty()) {
        //     right = stack.pop();
        //     if (!stack.isEmpty()){
        //         left = stack.pop();
        //     }
        //     else {
        //         root = right;
        //         break; 
        //     }
        //     if (!stack.isEmpty()){
        //         parent = stack.pop();
        //     }
        //     else {
        //         parent = left;
        //         left = right;
        //         right = null;
        //     }
        //     if (parent != null){
        //         parent.left = left;
        //         parent.right = right;
        //         stack.push(parent);
        //     }
        //     root = parent;
        //     parent = null;
        //     left = null;
        //     // right = null;
        // }
        // return root;
        
    }
}