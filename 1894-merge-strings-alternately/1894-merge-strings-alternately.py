class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        i,j=0,0
        res=""
        while ( i<len(word1) and j<len(word2) ):
            res+=str(word1[i])+str(word2[j])
            i+=1
            j+=1
        if(i!=len(word1)):
           res+=word1[i:]
        if(j!=len(word2)):
           res+=word2[j:]
        return res