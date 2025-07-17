class Solution {
    public int oddSubsequenceLength(int[] nums){
        int n = nums.length;
        int len = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] % 2 == 1){
                len ++;
            }
        }
        return len;
    }
    public int evenSubsequenceLength(int[] nums){
        int n = nums.length;
        int len = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] % 2 == 0){
                len ++;
            }
        }
        return len;
    }
    public int mixSubsequenceLength(int[] nums){
        int n = nums.length;
        int len = 1;
        int turn = (nums[0] % 2 == 0) ? 1 : 0;
        for(int i = 1; i < n; i++){
            if(nums[i] % 2 == turn){
                len ++;
                turn = (turn == 0) ? 1 : 0;
            }
        }
        return len;
    }
    public int maximumLength(int[] nums) {
        int n = nums.length;
        return Math.max(oddSubsequenceLength(nums),
        Math.max(evenSubsequenceLength(nums),mixSubsequenceLength(nums)));
    }
}