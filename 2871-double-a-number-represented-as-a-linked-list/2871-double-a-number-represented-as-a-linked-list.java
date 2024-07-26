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
    public ListNode doubleIt(ListNode head) {
        ListNode rev=null;
        ListNode temp=head;
        while(temp!=null)
        {
            ListNode x=new ListNode(); 
            x.val=temp.val;
            x.next=rev;
            rev=x;
            temp=temp.next;
        }
        temp=rev;
        ListNode out=null;
        int y=0;
        int a=0;
        while(temp!=null)
        {
            ListNode x=new ListNode(); 
            a=temp.val*2+y;
            x.val=a%10;
            y=a/10;
            x.next=out;
            out=x;
            temp=temp.next;
        }
        if(y!=0)
        {
            ListNode x=new ListNode(); 
            x.val=y;
            x.next=out;
            out=x;
        }
        // ListNode temp=head;
        // long res=0;
        // while(temp!=null)
        // {
        //     res=res*10+temp.val;
        //     temp=temp.next;
        // }
        // res=(long)(res*2);
        // ListNode out=new ListNode();
        // out.val=(int)(res%10);
        // res/=10;
        // //out.next=out;
        // while(res!=0)
        // {
        //    ListNode x=new ListNode(); 
        //    x.val=(int)(res%10);
        //    x.next=out;
        //    out=x;
        //    res/=10;
        // }
        // // temp=head;
        // // while(temp!=null)
        // // {

        // // }
         return out;
    }
}