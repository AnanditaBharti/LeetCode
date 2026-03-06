class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        int mid = (right - left) / 2;
        while(left <= right){
            if(mid > 0 && nums[mid - 1] > nums[mid]){
                right = mid - 1;
            }
            else if(mid < n - 1 && nums[mid + 1] > nums[mid]){
                left = mid + 1;
            }
            else {
                return mid;
            }
            mid = left + (right - left) / 2;
        }
        return -1;
    }
}