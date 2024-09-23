class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0;
        int right=-1;
        int zeros=0;
        int maxSize=0;
        int tempSize=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
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