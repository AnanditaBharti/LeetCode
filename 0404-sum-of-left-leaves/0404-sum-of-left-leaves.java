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
    public boolean isLeaf(TreeNode root)
    {
        if(root==null)
           return false;
        if(root.left==null && root.right==null)
           return true;
        return false;
    }
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null)
           return 0;
        int x=0;
        if(root.left!=null && isLeaf(root.left))
        {
            x+=root.left.val;
            //System.out.println("1 - "+x);
        }
        else
        {
            x+=sumOfLeftLeaves(root.left);
            //System.out.println("2 - "+x);
        }
        // if(root.right!=null && isLeaf(root.right))
        // {
        //     x+=root.right.val;
        //     System.out.println("3 - "+x);
        // }
        // else
        // {
            x+=sumOfLeftLeaves(root.right);
            //System.out.println("4 - "+x);
        // }
        return x;
    }
}