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
    ListNode reverseLL(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
    public int pairSum(ListNode head) {
        ListNode ptr1 = head;
        ListNode ptr2 = head;
        while(ptr2 != null){
            ptr1 = ptr1.next;
            ptr2 = ptr2.next.next;
        }
        ListNode half = reverseLL(ptr1);
        ptr1 = head;
        int max = Integer.MIN_VALUE;
        while(half != null){
            max = Math.max(max, ptr1.val + half.val);
            ptr1 = ptr1.next;
            half = half.next;
        }
        return max;
    }
}