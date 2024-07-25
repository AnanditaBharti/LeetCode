class Solution:
    def findRelativeRanks(self, score: List[int]) -> List[str]:
        list2=score.copy()
        c=4
        out=score.copy()
        for j in range(0,len(score)):
            m=max(list2)
            i=score.index(m)
            if j==0:
                out[i]=("Gold Medal")
            elif j==1:
                out[i]=("Silver Medal")
            elif j==2:
                out[i]=("Bronze Medal")
            else:
                out[i]=(str(c))
                c+=1
            list2.remove(m)
        return out 
        