class Solution {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int n = nums.length;
        int[] maxSuffixSum = new int[n+1];
        int maxSum = Integer.MIN_VALUE;
        maxSuffixSum[0] = 0;
        int index = 1;
        for (int i = 0; i < n; i++) {
            maxSuffixSum[index] = nums[i] + Math.max(0, maxSuffixSum[index-1]);
            maxSum = Math.max(maxSum, maxSuffixSum[index]);
            index++;
        }
        return maxSum;
    }
}