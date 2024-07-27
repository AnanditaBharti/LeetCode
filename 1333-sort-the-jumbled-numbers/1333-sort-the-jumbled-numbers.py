class Solution:
    def sortJumbled(self, mapping: List[int], nums: List[int]) -> List[int]:
        # val=[]
        # for i in nums:
        #     temp=0
        #     if(i==0):
        #         temp=mapping[0]
        #     x=0
        #     while(i!=0):
        #         a=i%10
        #         temp=temp+mapping[a]*(10**x)
        #         i//=10
        #         x+=1
        #     val.append(temp)
        # res=[]
        # #print(val)
        # while(val):
        #     m=min(val)
        #     i=val.index(m)
        #     res.append(nums[i])
        #     print(res)
        #     val.pop(i)
        # return res
        def map_value (val):
            temp=0
            if(val==0):
                temp=mapping[0]
            index=1
            while(val!=0):
                temp=temp+index*mapping[(val%10)]
                val//=10
                index*=10
            return temp
        # val=[]
        # for i in range(0,len(nums)):
        #     temp=(i,nums[i],map_value(nums[i]))
        #     val.append(temp)
        # for i in nums:
        #     print(map_value(i))
        nums.sort(key=map_value)
        return nums
            


