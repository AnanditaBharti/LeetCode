class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashMap<Integer,Integer> eleIndex = new HashMap<>();
        int maxSum = 0;
        int tempSum = 0;
        int startPtr = 0;
        // int endPtr = 0;
        int n = nums.length;
        int cummulativeSum[] = new int[n];
        cummulativeSum[0] = nums[0];
        for(int i = 1; i < n; i++){
            cummulativeSum[i] = cummulativeSum[i - 1] + nums[i];
        }
        for(int i = 0; i < n; i++){
            if(eleIndex.containsKey(nums[i]) && eleIndex.get(nums[i]) >= startPtr){
                startPtr = eleIndex.get(nums[i]) + 1;
                eleIndex.put(nums[i], i);

            }
            else{
                eleIndex.put(nums[i], i);
                tempSum = (startPtr == 0) ? cummulativeSum[i] : cummulativeSum[i] - cummulativeSum[startPtr - 1];
                maxSum = (tempSum > maxSum) ? tempSum : maxSum;
            }
        }
        return maxSum;
    }
}