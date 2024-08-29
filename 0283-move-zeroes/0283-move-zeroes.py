class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if len(nums)<2:
            return
        i,j=0,0 
        while(j<len(nums) and i<=j):
            while(i<len(nums) and nums[i]!=0):
                i+=1
            j=i
            while(j<len(nums) and nums[j]==0):
                j+=1
            if(i<len(nums) and j<len(nums)):
                temp=nums[i]
                nums[i]=nums[j]
                nums[j]=temp