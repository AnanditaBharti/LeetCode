# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        if head is None:
            return False
        def hasCycle2(head,li):
            if head.next is None:
                return False
            if head in li:
                return True
            li.append(head)
            return hasCycle2(head.next,li)
        li=[]
        return hasCycle2(head,li) 