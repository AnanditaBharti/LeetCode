class Solution:
    def increasingTriplet(self, nums: List[int]) -> bool:
        # dict1={}
        # dict2={}
        # i=nums[0]-1
        # for j in nums:
        #     dict2={}
        #     for k in dict1:
        #         if j>k:
        #             a=dict1[k]
        #             dict2.update({j:a+1})
        #     dict1.update(dict2)
        #     if(not dict1 ):
        #         dict1.update({j:1})
        # for j in dict1.values():
        #     if j>=3:
        #         return True
        # return False
        a,b,c=max(nums)+1,max(nums)+1,max(nums)+1 #a=1,b=2,c=6
        #print(a,b,c)
        for j in nums: #j=3
            if j<a:
                a=j
            if j>a and j<b:
                b=j
            if j>a and j>b:
                return True
        return False
        