# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def sortedArrayToBST(self, nums: List[int]) -> Optional[TreeNode]:
        if not nums:
            return None
        # n1=TreeNode(nums[0])
        # temp=n1
        # prev=temp
        # for n in nums[1:]:
        #     n2=TreeNode(n)
        #     while(temp is not None and n2.val<=temp.val):
        #         prev=temp
        #         temp=temp.left
        #     while(temp is not None and n2.val>temp.val):
        #         prev=temp
        #         temp=temp.right
        #     if n2.val<=prev.val:
        #         prev.left=n2
        #     else:
        #         prev.right=n2
        #     temp=n1
        # return n1
        # mid=len(nums)//2
        # n1=TreeNode(nums[mid])
        # for n in nums[:mid]:
        #     n2=TreeNode(n)
        #     temp=n1.left
        #     prev=n1
        #     while temp is not None:
        #         prev=temp
        #         if(n2.val<=temp.val):
        #             temp=temp.left
        #         else:
        #             temp=temp.right
        #     if n2.val<=prev.val:
        #         prev.left=n2
        #     else:
        #         prev.right=n2
        # for n in nums[mid+1:]:
        #     n2=TreeNode(n)
        #     temp=n1.right
        #     prev=n1
        #     while temp is not None:
        #         prev=temp
        #         if(n2.val<=temp.val):
        #             temp=temp.left
        #         else:
        #             temp=temp.right
        #     if n2.val<=prev.val:
        #         prev.left=n2
        #     else:
        #         prev.right=n2
        # return n1
        def sortedArrayToBST2(nums,start,end):
            if start>end:
                return None
            else:
                mid=start+(end-start)//2
                node=TreeNode(nums[mid])
                node.left=sortedArrayToBST2(nums,start,mid-1)
                node.right=sortedArrayToBST2(nums,mid+1,end)
                return node
        return sortedArrayToBST2(nums,0,len(nums)-1)