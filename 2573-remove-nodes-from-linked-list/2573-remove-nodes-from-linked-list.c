/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeNodes(struct ListNode* head) {
    struct ListNode* temp=head;
    int count=0;
    while(temp!=NULL)
    {
        // if(temp.val>max)
        // {
        //     temp.val=temp.next.val;
        //     temp.next=temp.next.next;
        // }
        count++;
        temp=temp->next;
    }
    int arr[count];
    int i=0;
    temp=head;
    while(temp!=NULL)
    {
        arr[i]=temp->val;
        temp=temp->next;
        i++;
    }
    int max=0;
    for(int j=count-1;j>=0;j--)
    {
        if(arr[j]<max)
        {
            arr[j]=-1;
        }
        else if(arr[j]>max)
        {
            max=arr[j];
        }
    }
    struct ListNode* prev;
    temp=head;
    for(int j=0;j<count;j++)
    {
        if(arr[j]!=-1 )
        {
            temp->val=arr[j];
            prev=temp;
            temp=temp->next;
        }
    }
    // if(temp!=NULL)
    //    temp->next=NULL;
    prev->next=NULL;
    return head;
}