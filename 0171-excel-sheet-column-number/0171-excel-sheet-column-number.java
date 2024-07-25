class Solution {
    public int titleToNumber(String columnTitle) {
        int res=0;
        int len = columnTitle.length();
        for(int i=0;i<len;i++)
        {
            char c=columnTitle.charAt(i);
            int val=c-'A';
            val++;
            res=res*26+val;

        }
        return res;
    }
}