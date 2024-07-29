class Solution:
    def hammingWeight(self, n: int) -> int:
        check=0
        while (n!=0):
            a=n&1
            if(a==1):
                check+=1
            n=n>>1
        return check