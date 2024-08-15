# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        if head is None or head.next is None:
            return True
        else:
            slow,fast=head,head
            while(fast and fast.next):
                slow=slow.next
                fast=fast.next.next
            check=[]
            # print(slow)
            while(slow):
                check.append(slow)
                slow=slow.next
            # print(check)
            while(check):
                if head.val != check.pop().val:
                    return False
                head=head.next
            return True