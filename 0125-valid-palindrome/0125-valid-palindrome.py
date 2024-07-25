class Solution:
    def isPalindrome(self, s: str) -> bool:
        s=s.lower()
        s=re.sub(r'[^a-zA-Z0-9]','',s)
        for i in range(0,len(s)//2):
            if s[i]!=s[len(s)-1-i]:
                return False
        return True