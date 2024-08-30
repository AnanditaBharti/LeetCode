class Solution {
    public int maxArea(int[] height) {
        // if(height.length <2)
        //   return 0;
        // int tempHeight=height[0];
        // int tempHeightIndex=0;
        // int tempVol=0;
        // int maxHeight=height[0];
        // int maxHeightIndex=0;
        // for(int i=1;i<height.length;i++)
        // {
        //     if(height[i]>=tempHeight)
        //     {
        //         int vol1=tempHeight*(i-tempHeightIndex);
        //         int vol2=maxHeight*(i-maxHeightIndex);
        //         System.out.print(i+" "+tempHeight+" "+maxHeight+" ");
                
        //         if(vol1>vol2 && vol1>=tempVol)
        //         {
        //             tempVol=vol1;
        //         }
        //         else if(vol2>=tempVol)
        //         {
        //             tempVol=vol2;
        //             tempHeight=maxHeight;
        //             tempHeightIndex=maxHeightIndex;
        //         }
        //         if (height[i]>maxHeight){
        //             maxHeight=height[i];
        //             maxHeightIndex=i;
        //         }
                
        //     }
        //     else
        //     {
        //         int vol1=height[i]*(i-tempHeightIndex);
        //         if(vol1>tempVol)
        //         {
        //             tempVol=vol1;
        //             tempHeight=height[i];
        //             tempHeightIndex=i;
        //         }
        //     }
        //     System.out.println(tempVol);
        // }
        // return tempVol;

        int left=0;
        int right=height.length-1;
        int maxVol=0;
        while(left<right)
        {
            int tempHeight=Math.min(height[left],height[right]);
            int tempWidth=right-left;
            int tempVol=tempHeight*tempWidth;
            maxVol=Math.max(maxVol,tempVol);
            if(height[left]<height[right])
               left++;
            else
               right--;
        }
        return maxVol;
    }
}