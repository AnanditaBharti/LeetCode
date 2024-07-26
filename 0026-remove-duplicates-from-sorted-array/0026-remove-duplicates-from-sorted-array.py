class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        temp=[]
        for i in range(0,len(nums)):
            if(nums[i] not in temp):
                temp.append(nums[i])
        x=len(temp)
        for i in range(0,x):
            nums[i]=temp[i]
        return x