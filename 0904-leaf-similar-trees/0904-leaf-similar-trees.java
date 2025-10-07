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
    List<Integer> listOfLeafNodes(List<Integer> leafNodes, TreeNode root){
        if(root == null){
            return leafNodes;
        }
        if(root.left == null && root.right == null){
            leafNodes.add(root.val);
        }
        else{
            listOfLeafNodes(leafNodes, root.left);
            listOfLeafNodes(leafNodes, root.right);
        }
        return leafNodes;
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> root1LeafNodes = new LinkedList<>();
        listOfLeafNodes(root1LeafNodes, root1);
        List<Integer> root2LeafNodes = new LinkedList<>();
        listOfLeafNodes(root2LeafNodes, root2);
        if(root1LeafNodes.size() != root2LeafNodes.size())
            return false;
        for(int i = 0; i < root1LeafNodes.size(); i++){
            if(!root1LeafNodes.get(i).equals(root2LeafNodes.get(i)))
                return false;
        } 
        return true;
    }
}