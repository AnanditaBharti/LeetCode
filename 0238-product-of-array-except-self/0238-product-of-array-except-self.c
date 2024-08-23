/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* productExceptSelf(int* nums, int numsSize, int* returnSize) {
    int product=1;
    for(int i=0;i<numsSize;i++)
    {
        product*=nums[i];
    }
    int* result=(int*)malloc(sizeof(int)*numsSize);
    for(int i=0;i<numsSize;i++)
    {
        if (nums[i]!=0)
           result[i]=product/nums[i];
        else{
           result[i]=1;
           for(int j=0;j<numsSize;j++)
           {
               if(j!=i)
                   result[i]*=nums[j];
           }
        }
    }
    *returnSize=numsSize;
    return result;
}