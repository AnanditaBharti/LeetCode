class Solution {
    public int jump(int[] nums) {
        if (nums == null)
            return 0;
        int n = nums.length;
        int[] minSteps = new int[n];
        for (int i = 1; i < n; i++) {
            minSteps[i] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <= (i + nums[i]) && j < n; j++) {
                minSteps[j] = Math.min(minSteps[j], minSteps[i] + 1);
            }
        }
        return minSteps[n - 1];
    }
}