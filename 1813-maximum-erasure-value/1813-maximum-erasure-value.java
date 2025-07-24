class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int left = 0, right = 0;
        int maxSum = 0, currentSum = 0;
        HashSet<Integer> set = new HashSet<>();

        while (right < nums.length) {
            if (!set.contains(nums[right])) {
                set.add(nums[right]);
                currentSum += nums[right];
                maxSum = Math.max(maxSum, currentSum);
                right++;
            } else {
                set.remove(nums[left]);
                currentSum -= nums[left];
                left++;
            }
        }

        return maxSum;
    }
}