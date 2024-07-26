int strStr(char* haystack, char* needle) {
    for(int i=0;i<strlen(haystack);i++)
    {
        if(haystack[i]==needle[0])
        {
            int check=1;
            for(int j=1;j<strlen(needle);j++)
            {
                if(haystack[i+j]!=needle[j])
                {
                    check=0;
                    break;
                }
            }
            if(check==1)
            {
                return i;
            }
        }
    }
    return -1;
}