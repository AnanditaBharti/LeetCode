class Solution:
    def increasingTriplet(self, nums: List[int]) -> bool:
        a,b=max(nums)+1,max(nums)+1
        for j in nums:
            if j<a:
                a=j
            if j>a and j<b:
                b=j
            if j>a and j>b:
                return True
        return False
        