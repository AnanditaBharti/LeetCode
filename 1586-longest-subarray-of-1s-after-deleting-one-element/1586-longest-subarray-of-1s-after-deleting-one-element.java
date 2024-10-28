class Solution {
    public int longestSubarray(int[] nums) {
        int leftPointer=0;
        boolean zeroDropped=false;
        int droppedZeroIndex=0;
        int n = nums.length;
        int maxLength=0;//2
        boolean deletedOnce=false;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==1)
            {
                if(nums[leftPointer]==0){
                   leftPointer=i;
                   zeroDropped=false;
                }
                int temp=0;
                if(zeroDropped)
                {
                    temp=i-leftPointer;
                }
                else
                {
                    temp=i-leftPointer+1;
                }
                if(temp>maxLength){
                   maxLength = temp;
                }
            }
            else if(!zeroDropped)
            {
                zeroDropped=true;
                deletedOnce=true;
                droppedZeroIndex=i;
            }
            else
            {
                leftPointer=droppedZeroIndex+1;
                droppedZeroIndex=i;
            }
        }
        return (deletedOnce)?maxLength:maxLength-1;
    }
}