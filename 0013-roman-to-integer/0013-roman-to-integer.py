class Solution(object):
    def romanToInt(self, s):
        """
        :type s: str
        :rtype: int
        """
        if(len(s)==0):
            return 0
        else:
            val = {'M':1000,'D':500,'C':100,'L':50,'X':10,'V':5,'I':1}
            res=0
            prev=1000
            for i in range(0,len(s)):
                temp= val[s[i]]
                res += temp
                if (prev<temp):
                    res -= 2*prev
                prev = temp
            return res
        