/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
int minDepth(struct TreeNode* root) {
    if(root == NULL)
      return 0;
    else if(root->left == NULL && root->right == NULL)
      return 1;
    int d1 = minDepth(root->left);
    int d2 = minDepth(root->right);
    if(d1!=0 && d2!=0)
       return 1+((d1<d2)? d1:d2) ;
    if(d1==0)
       return 1+d2;
    else
      return 1+d1;
}