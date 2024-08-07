class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
        dict1={}
        for i in range(0,len(nums)):
            if nums[i] in dict1:
                a=abs(dict1.get(nums[i])-i)
                if a<=k:
                    return True
                else:
                    dict1.update({nums[i]:i})
            else:
                dict1.update({nums[i]:i})
        return False