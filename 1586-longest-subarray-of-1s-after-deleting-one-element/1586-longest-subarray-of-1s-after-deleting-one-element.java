class Solution {
    public int longestSubarray(int[] nums) {
        int leftPointer=0;//4
        // int rightPointer=0;
        boolean zeroDropped=false;//true//false//true
        int droppedZeroIndex=0;//3//5
        int n = nums.length;
        int maxLength=0;//2
        boolean deletedOnce=false;//true
        for(int i=0;i<n;i++)//6
        {
            if(nums[i]==1)
            {
                // rightPointer=i;
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
                   System.out.println(leftPointer+" "+i);
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
                // zeroDropped=false;
            }
        }
        return (deletedOnce)?maxLength:maxLength-1;
    //     boolean start=false;
    //     int res=0;
    //     int temp=0;
    //     for(int i=0;i<n;i++)
    //     {
    //         if(nums[i]==0)
    //         {
    //             if(start)
    //             {
    //                 if(!zero){
    //                   zero=true;
    //                   right=i;
    //                 }
    //                 else
    //                 {
    //                     while(nums[left]==1)
    //                     {
    //                         left++;

    //                     }
    //                     left++;
    //                 }
    //             }
                
    //         }
    //         else
    //         {
    //             temp++;
    //             if(!start)
    //             {
    //                 start=true;
    //             }
    //             right=i;
    //         }
    //         temp=right-left+1;
    //         if(zero)
    //         {
    //             // if(nums[right]==1)
    //               temp--;
                  
    //         }
    //         if(temp>res)
    //           res=temp;
            
    //     }
    //     int res2=right-left;
    //     if(!zero)
    //       res2--;
    //     return res;
    }
}