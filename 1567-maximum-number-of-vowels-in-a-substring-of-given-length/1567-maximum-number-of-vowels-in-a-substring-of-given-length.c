int maxVowels(char* s, int k) {
    if(strlen(s)<k)
      return 0;
    int maxCount=0;
    for(int i=0;i<k;i++)
    {
        if(s[i]=='a' || s[i]=='e' || s[i]=='i' || s[i]=='o' || s[i]=='u')
           maxCount+=1;
    }
    int temp=maxCount;
    for(int i=k;i<strlen(s);i++)
    {
        if(s[i]=='a' || s[i]=='e' || s[i]=='i' || s[i]=='o' || s[i]=='u')
           temp+=1;
        if(s[i-k]=='a' || s[i-k]=='e' || s[i-k]=='i' || s[i-k]=='o' || s[i-k]=='u')
           temp-=1;
        if(temp>maxCount)
           maxCount=temp;
    }
    return maxCount;
}