class Solution:
    def maxRepeating(self, sequence: str, word: str) -> int:
        count=0
        temp=word
        while(True):
            if(temp in sequence):
                count+=1
            else:
                break
            temp+=word
        return count