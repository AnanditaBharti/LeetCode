class Solution {
    public int jump(int[] nums) {
        
        if (nums == null)
            return 0;
        int n = nums.length;

        // dynamic programming approach

        // int[] minSteps = new int[n];
        // for (int i = 1; i < n; i++) {
        //     minSteps[i] = Integer.MAX_VALUE;
        // }
        // for (int i = 0; i < n; i++) {
        //     for (int j = i+1; j <= (i + nums[i]) && j < n; j++) {
        //         minSteps[j] = Math.min(minSteps[j], minSteps[i] + 1);
        //     }
        // }
        // return minSteps[n - 1];

        int farthest = 0;
        int currJump = 0;
        int jumps = 0;

        for (int i = 0; i < n - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);
            if (i >= currJump) {
                jumps ++;
                currJump = farthest;
            }
        }
        return jumps;
    }
}