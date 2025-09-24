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
        int mid = 0;
        int size = 0;
        ListNode temp = head;
        while(temp != null){
            size ++;
            temp = temp.next;
        }
        if(size <= 1){
            return null;
        }
        mid = size / 2;
        ListNode curr = head;
        for(int i = 1; i < mid; i++){
            curr = curr.next;
        }
        temp = (curr.next != null) ? curr.next.next : null;
        curr.next = temp;
        return head;
    }
}