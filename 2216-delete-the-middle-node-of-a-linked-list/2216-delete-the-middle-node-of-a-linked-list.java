/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        if(head.next.next == null){
            head.next = null;
            return head;
        }
        ListNode ptr1 = head;
        ListNode ptr2 = head.next.next;
        while(ptr2 != null && ptr2.next != null){
            ptr2 = ptr2.next.next;
            ptr1 = ptr1.next;
        }
        ptr1.next = ptr1.next.next;
        return head;
    }
}