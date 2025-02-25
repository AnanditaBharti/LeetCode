class Solution {
    public int numOfSubarrays(int[] arr) {
        int noOfEvenSubArray = 0;
        int noOfOddSubArray = 0;
        int result = 0;
        int MOD = 1000000007;
        for(int i : arr) {
            if (i % 2 == 0) {
                result = (result + noOfOddSubArray) % MOD;
                noOfEvenSubArray ++ ;
            }
            else {
                result = (result + noOfEvenSubArray + 1) % MOD;
                int temp = noOfOddSubArray;
                noOfOddSubArray = noOfEvenSubArray + 1;
                noOfEvenSubArray = temp;
            }
        }
        return result;
    }
}