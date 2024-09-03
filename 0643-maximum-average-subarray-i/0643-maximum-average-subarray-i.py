class Solution:
    def findMaxAverage(self, nums: List[int], k: int) -> float:
        tot=0
        for i in range(0,k):
            tot+=nums[i]
        temp=tot
        a=0
        for i in range(k,len(nums)):
            temp=temp+nums[i]-nums[a]
            a+=1
            if(temp>tot):
                tot=temp
        return tot/k