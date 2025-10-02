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
    public int pairSum(ListNode head) {
        int n = 0;
        ListNode temp = head;
        while(temp != null){
            n++;
            temp = temp.next;
        }
        // System.out.println(n);
        int[] sum = new int[n / 2];
        int count = 0;
        temp = head;
        while(count < n / 2){
            // System.out.println(count % (n / 2));
            sum[count] += temp.val;
            count ++;
            temp = temp.next;
        }
        count --;
        while(count >= 0){
            // System.out.println(count % (n / 2));
            sum[count] += temp.val;
            count --;
            temp = temp.next;
        }
        int max = sum[0];
        // System.out.println(sum[0]);
        for(int i = 1; i < n / 2; i++){
            max = Math.max(max, sum[i]);
            // System.out.println(sum[i]);
        }
        return max;
    }
}