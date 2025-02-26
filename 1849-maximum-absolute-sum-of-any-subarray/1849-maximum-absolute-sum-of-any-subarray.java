class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int prefixMinSum = 0;
        int prefixMaxSum = 0;

        int absMax = 0;

        for (int ele : nums) {
            prefixMinSum = Math.min(ele, prefixMinSum + ele);
            prefixMaxSum = Math.max(ele, prefixMaxSum + ele);
            absMax = Math.max(absMax, Math.max(Math.abs(prefixMinSum), Math.abs(prefixMaxSum)));

        }
        return absMax;
    }
}