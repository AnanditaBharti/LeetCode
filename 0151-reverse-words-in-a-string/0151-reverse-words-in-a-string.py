class Solution:
    def reverseWords(self, s: str) -> str:
        i=0
        li=[]
        s=s.strip()
        # print("-",s)

        for j in range(1,len(s)):
            if s[i]==" ":
                i+=1
                continue
            if s[j] == ' ':
                li.append(s[i:j])
                i=j+1
        if i<len(s):
            li.append(s[i:])
        li.reverse()
        return " ".join(li)