/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* mergeTwoLists(struct ListNode* list1, struct ListNode* list2) {
    //struct ListNode* temp=(struct ListNode*) malloc(sizeof(struct ListNode));
    // temp->val=list1->val;
    // temp->next=NULL;
    // return temp;

    if(list1==NULL && list2==NULL)
    {
       return NULL;
    }
    else if(list1==NULL)
    {
        return list2;
    }
    else if(list2==NULL)
    {
        return list1;
    }
    else
    {
        struct ListNode* temp=NULL;//=(struct ListNode*) malloc(sizeof(struct ListNode));
        struct ListNode* x = list1;
        struct ListNode* y = list2;
        //int count =0;
        struct ListNode* temp2=NULL;
        while (true)
        {
            struct ListNode *z;
            if(x==NULL || y==NULL)
               break;
            if(x->val <= y->val)
            {
                z=x;
                x=x->next;
                //count++;
            }
            else if(y->val < x->val)
            {
                z=y;
                y=y->next;
            }
            if(temp==NULL)
            {
                temp=z;
                temp2=z;
               // count++;
            }
            else
            {
                (temp2->next)=z;
                temp2=z;
               // count++;
            }
            

        }
        if(x!=NULL)
        {
            temp2->next=x;
        }
        else
        {
            temp2->next=y;
        }
        return temp;
    }
}