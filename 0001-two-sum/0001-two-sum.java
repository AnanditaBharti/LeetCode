class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                if(j==i)
                   continue;
                if(nums[j]+nums[i]==target)
                {
                    int[] ans={i,j};
                    return ans;
                }
            }
        }
        int[] ans={-1,-1};
        return ans;
    }
}