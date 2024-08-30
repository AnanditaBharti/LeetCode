class Solution {
    public int maxArea(int[] height) {
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