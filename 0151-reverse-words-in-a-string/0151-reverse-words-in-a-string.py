class Solution:
    def reverseWords(self, s: str) -> str:
        s=s.strip()
        while "  " in s:
            s=s.replace("  "," ")
        li=s.split(" ")
        li.reverse()
        return " ".join(li)
