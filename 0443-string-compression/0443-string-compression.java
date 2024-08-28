class Solution {
    public int compress(char[] chars) {
        char curr=chars[0];
        int count=1;
        String res="";
        for(int i=1;i<chars.length;i++)
        {
            if(chars[i]==curr)
            {
                count++;
            }
            else if(count==1)
            {
                res+=curr;
                curr=chars[i];
            }
            else
            {
                res+=curr;
                res+=count;
                count=1;
                curr=chars[i];
            }
        }
        if(count==1)
        {
            res+=curr;
        }
        else
        {
                res+=curr;
                res+=count;
                
        }
        for (int i=0;i<res.length();i++)
        {
            chars[i]=res.charAt(i);
        }
        return res.length();
    }
}