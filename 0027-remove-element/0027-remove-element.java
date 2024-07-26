class Solution {
    public int removeElement(int[] nums, int val) {
        int temp[]=new int[nums.length];
       // HashSet<Integer> hs=new HashSet<>();
       int count=0;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
                temp[count]=nums[i];
                count++;
            }
        }
        for(int i=0;i<count;i++)
        {
            nums[i]=temp[i];
        }
        return count;
    }
}