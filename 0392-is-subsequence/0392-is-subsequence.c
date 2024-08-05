// bool helper(char* s, char* t,)
// {

// }
bool isSubsequence(char* s, char* t) {
    if (s==NULL || strlen(s)==0)
       return true;
    if (t==NULL || strlen(t)==0)
       return false;
    char* a=(char*)malloc((strlen(s))*sizeof(char));
    strncpy(a,s+1,strlen(s)-1);
    a[strlen(s)-1]='\0';

    char* b=(char*)malloc((strlen(t))*sizeof(char));
    strncpy(b,t+1,strlen(t)-1);
    b[strlen(t)-1]='\0';
    if (t[0]==s[0])
    {
        return isSubsequence(a,b);
    }
    else
    {
        return isSubsequence(s,b);
    }
}