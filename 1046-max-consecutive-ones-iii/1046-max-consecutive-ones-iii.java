class Solution {
    public int longestOnes(int[] nums, int k) {
        // int max1=0;
        // int tempWindow=0;
        // int k2=k;
        // boolean f=true;
        // for(int i=0;i<nums.length;i++)
        // {
        //     if(nums[i]==1)
        //     {
        //         tempWindow+=1;
        //         f=false;

        //     }
        //     else if(f && k2!=0)
        //     {
        //         tempWindow+=1;
        //         k2--;
        //     }
        //     else if(!f)
        //     {
        //         if(tempWindow>max1)
        //            max1=tempWindow;
        //         tempWindow=max1-(k-k2);
        //         k2=k-1;
        //         f=true;
        //     }
        // }
        // return max1;

        int left=0;
        int right=-1;
        int zeros=0;
        int maxSize=0;
        int tempSize=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                // if(zeros<=k)
                // {
                //     tempSize++;
                //     right=i;
                // }
                // else
                // {
                //     left=right=i;
                //     tempSize=1;
                // }
                right++;
                tempSize++;

            }
            else if (zeros>=k)
            {
                while(nums[left]!=0)
                {
                    left++;
                }
                left++;
                right++;
                tempSize=right-left+1;
            }
            else
            {
                right++;
                zeros++;
                tempSize++;
            }
            if(tempSize>maxSize)
               maxSize=tempSize;
            
        }
        return maxSize;
    }
}