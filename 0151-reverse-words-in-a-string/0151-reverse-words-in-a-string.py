class Solution:
    def reverseWords(self, s: str) -> str:
        # i=0
        # li=[]
        # s=s.strip()
        # for j in range(1,len(s)):
        #     if s[i]==" ":
        #         i+=1
        #         continue
        #     if s[j] == ' ':
        #         li.append(s[i:j])
        #         i=j+1
        # if i<len(s):
        #     li.append(s[i:])
        # li.reverse()
        # return " ".join(li)
        s=s.strip()
        while "  " in s:
            s=s.replace("  "," ")
        li=s.split(" ")
        li.reverse()
        return " ".join(li)
