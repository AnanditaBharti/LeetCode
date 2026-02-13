class Solution {
    public int findKthLargest(int[] nums, int k) {
        // Arrays.sort(nums);
        // return nums[nums.length - k];
        int n = nums.length;
        int targetIndex = n - k;
        int currIndex = 0;
        int left = 0;
        int right = n - 1;
        while(left <= right){
            currIndex = quickselect(nums, left, right);
            if(currIndex == targetIndex)
                return nums[currIndex];
            else if(currIndex < targetIndex){
                left = currIndex + 1;
            }
            else{
                right = currIndex - 1;
            }
        }
        return -1;

    }
    public int quickselect(int[] nums, int left, int right){
        if(left == right)
            return right;
        int i = left;
        int j = left;
        int pivot = nums[right];
        while(j < right){
            if(nums[j] < pivot){
                swap(nums, i, j);
                i ++;
            }
            j ++;
        }
        swap(nums, i, right);
        return i;
    }
    public void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}