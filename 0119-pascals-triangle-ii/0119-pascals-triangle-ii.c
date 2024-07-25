/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* getRow(int rowIndex, int* returnSize) {
    int* res=(int*)malloc((rowIndex+1)*sizeof(int));
    int* prev=(int*)malloc((rowIndex+1)*sizeof(int));
    *returnSize=rowIndex+1;
    for(int i=0;i<rowIndex;i++)
    {
        int temp[i+1];
        if(i==0)
        {
            temp[0]=1;
            prev[0]=temp[0];
        }
        else
        {
            for(int j=0;j<=i;j++)
            {
                if(j==0)
                {
                    temp[j]=prev[j];
                }
                else if(j==i)
                {
                    temp[j]=prev[j-1];
                }
                else
                {
                    temp[j]=prev[j]+prev[j-1];
                }
            }
            for(int j=0;j<=i;j++)
               prev[j]=temp[j];
        }
    }
    if(rowIndex==0)
        {
            res[0]=1;
        }
        else
        {
            for(int j=0;j<=rowIndex;j++)
            {
                if(j==0)
                {
                    res[j]=prev[j];
                }
                else if(j==rowIndex)
                {
                    res[j]=prev[j-1];
                }
                else
                {
                    res[j]=prev[j]+prev[j-1];
                }
            }
        }
    return res;
}