# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def postorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        li=[]
        if root is None:
            return li
        li=li+self.postorderTraversal(root.left)
        li=li+self.postorderTraversal(root.right)
        li.append(root.val)
        return li