class Solution:
    def isHappy(self, n: int) -> bool:
        check_loop=[]
        while (True):
            temp=0
            while(n!=0):
                temp+=(n%10)**2
                n//=10
            if (temp==1):
                return True
            if temp in check_loop:
                return False
            check_loop.append(temp)
            n=temp