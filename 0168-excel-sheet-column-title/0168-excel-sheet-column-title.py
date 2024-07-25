class Solution:
    def convertToTitle(self, columnNumber: int) -> str:
        output=""
        alpha="ABCDEFGHIJKLMNOPQRSTUVWXYZ"
        #x=columnNumber/26
        while(columnNumber>0):
            columnNumber-=1
            rem=columnNumber%26
            c=alpha[rem]
            output=c+output
            columnNumber//=26
        return output