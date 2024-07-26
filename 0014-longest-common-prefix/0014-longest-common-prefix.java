class Solution {
    public String longestCommonPrefix(String[] strs) {
        /*String common=strs[0];
        for (int i=1;i<strs.length;i++)
        {
            for(int j=0;j<strs[i].length();j++)
            {
                if(common.charAt(j)!=strs[i].charAt(j))
                {
                    common=strs[i].substring(0,j+1);
                    break;
                }
                if(common=="")
                   return common;
            }
        }
        return common;*/
        String common="";
        int small=strs[0].length();
        for (int i=1;i<strs.length;i++)
        {
            if(strs[i].length()<small)
                small=strs[i].length();
        }
        for(int i=0;i<small;i++)
        {
            char temp=strs[0].charAt(i);
            boolean flag=true;
            for(int j=1;j<strs.length;j++)
            {
                if(strs[j].charAt(i)!=temp)
                {
                    flag=false;
                    break;
                }
            }
            if(flag)
               common+=temp;
            else
            {
                return common;
            }
        }
        return common;
    }
}