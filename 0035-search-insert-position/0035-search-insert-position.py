class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        i=0
        j=len(nums)-1
        if(i==j):
            if(target<=nums[i]):
                return i
            else:
                return i+1
        mid=(i+j)//2
        if(nums[mid]==target):
            return mid
        elif(target<nums[mid]):
            return self.searchInsert(nums[0:mid+1],target)
        else:
            return mid+1+self.searchInsert(nums[mid+1:len(nums)],target)