class Solution {
    public int maxAbsoluteSum(int[] nums) {
        // int currentSum = 0;
        // int currentMax = 0;

        int maxSum = 0;
        int minSum = 0;

        int prefixMinSum = 0;
        int prefixMaxSum = 0;

        int absMax = 0;

        for (int ele : nums) {

            prefixMinSum = Math.min(ele, prefixMinSum + ele);
            prefixMaxSum = Math.max(ele, prefixMaxSum + ele);

            absMax = Math.max(absMax, Math.max(Math.abs(prefixMinSum), Math.abs(prefixMaxSum)));

            // System.out.println(ele+": "+ Math.abs(prefixMinSum)+","+Math.abs(prefixMinSum));

            // currentSum += ele;
            // if ()

            // currentMax = Math.max(Math.abs(ele), Math.abs(currentSum + ele));

            // System.out.println(ele+": "+ currentMax);

            // if (currentMax > maxSum)
            //     maxSum = currentMax;
            // currentSum = Math.max(ele, currentSum+ele);
        }
        return absMax;
    }
}