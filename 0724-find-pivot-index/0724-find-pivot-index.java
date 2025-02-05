class Solution {
    public int pivotIndex(int[] nums) {
        if(nums == null || nums.length == 0)
           return -1 ;
        int n = nums.length ;
        int leftSum = 0 ;
        int rightSum = Arrays.stream(nums).sum() - nums[0];
        if(leftSum == rightSum)
           return 0;
        for(int i=0 ; i<n-1 ; i++){
            leftSum += nums[i] ;
            rightSum -= nums[i+1];
            if(leftSum == rightSum)
               return i+1;
        }
        return -1;
    }
}