class Solution:
    def threeConsecutiveOdds(self, arr: List[int]) -> bool:
        count=0
        for a in arr:
            if a%2==1:
                count+=1
            elif count>0:
                count=0
            if count==3:
                return True
        return False