class Solution {
    public boolean canPartition(int[] nums) {
        if(nums == null || nums.length <= 1){
            return false;
        }
        int totalSum = 0;
        for(int i: nums){
            totalSum += i;
        }
        if(totalSum % 2 == 1){
            return false;
        }

        int target = totalSum / 2;
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;
        for(int ele: nums){
            for(int i = target; i >= ele; i--){
                dp[i] = dp[i] || dp[i - ele];
            }
            if(dp[target]){
                return true;
            }
        }
        return false;
    }


    
    // // using Brute Force
    // public boolean helper(int[] nums,int currSum, int totalSum, int index){
    //     if(index >= nums.length){
    //         if(currSum == (totalSum - currSum)){
    //             return true;
    //         }
    //         else{
    //             return false;
    //         }
    //     }
    //     boolean includeCurrEle = helper(nums, currSum + nums[index], totalSum, index + 1);
    //     boolean excludeCurrEle = helper(nums, currSum , totalSum, index + 1);

    //     return includeCurrEle || excludeCurrEle;
    // }
    // public boolean canPartition(int[] nums) {
    //     if(nums == null || nums.length <= 1){
    //         return false;
    //     }
    //     int totalSum = 0;
    //     for(int i: nums){
    //         totalSum += i;
    //     }
    //     return helper(nums, 0, totalSum, 0);
    // }
}