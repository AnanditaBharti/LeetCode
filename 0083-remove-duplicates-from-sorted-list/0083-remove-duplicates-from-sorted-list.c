/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* deleteDuplicates(struct ListNode* head) {
    struct ListNode* out=NULL;
    int curr=-200;
    //int count=0;
    struct ListNode* temp=head;
    struct ListNode* temp2=out;
    while(temp!=NULL)
    {
        if(temp->val!=curr)
        {
            struct ListNode* x=(struct ListNode*)malloc(sizeof(struct ListNode));
            x->val=temp->val;
            x->next=NULL;
            if(out==NULL){
                out=x;
                temp2=out;
            }
            else{
                temp2->next=x;
                temp2=temp2->next;
            }
            //count++;
            curr=x->val;
        }
        temp=temp->next;
    }
    // struct ListNode* out2;//=malloc(count*(sizeof(struct ListNode*)));
    // temp=out2;
    // temp2=out;
    // while(temp2!=NULL)
    // {
    //     struct ListNode* x=malloc(sizeof(struct ListNode*));
    //     x->val=temp2->val;
    //     x->next=NULL;
    //     if(out2==NULL)
    //     {
    //         out2=x;
    //         temp=out2;
    //     }
    //     else{
    //         temp->next=x;
    //         temp=temp->next;
    //     }
    //     temp2=temp2->next;
    // }
    return out;
}