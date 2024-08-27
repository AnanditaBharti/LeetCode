class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int count=0;
        int sum=0;
        int mod=1000000007;
        int j=nums.length-1;
        int[] pow2 = new int[nums.length];
        pow2[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            pow2[i] = (pow2[i - 1] * 2) % mod;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>target)
              break;
           while(j>=i && nums[i]+nums[j]>target)
               j--;
            if(j>=i){
                count=(count+pow2[j-i])%mod;
            //    count=(count+(int)Math.pow(2,j-i))%mod;
            }
            else
              break;
        }
        return count;
    }
}