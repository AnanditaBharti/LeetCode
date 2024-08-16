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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list =new ArrayList<String>();
        HashSet<String> hs = new HashSet<>();
        if(root == null)
           return list;
        String s1=""+root.val;
        if(root.left !=null)
        {
            for(String i:binaryTreePaths(root.left))
            {
                hs.add(s1+"->"+i);
            }
        }
        //String s2=""+root.val;
        if(root.right !=null)
        {
            for(String i:binaryTreePaths(root.right))
            {
                hs.add(s1+"->"+i);
            }
        }
        for(String i:hs)
        {
            list.add(i);
        }
        if(hs.isEmpty())
           list.add(s1);
        return list;
    }
}