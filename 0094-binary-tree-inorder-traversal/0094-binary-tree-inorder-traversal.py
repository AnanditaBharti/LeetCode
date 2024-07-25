# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def inorderTraversal2(self,root,res):
        # if len(root)==0:
        #     return res
        # if len(root)==1:
        #     res.append(root[0])
        #     return res
        if root==None:
            return res
        self.inorderTraversal2(root.left,res)
        res.append(root.val)
        self.inorderTraversal2(root.right,res)
        return res
    def inorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        res=[]
        res=self.inorderTraversal2(root,res)
        return res
    
        
        