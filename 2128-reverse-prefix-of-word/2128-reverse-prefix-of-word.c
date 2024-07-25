char* reversePrefix(char* word, char ch) {
    int i=0;
    int check=0;
    while(word[i]!='\0')
    {
        if(word[i]==ch)
        {
            check=1;
            break;
        }
        i++;
    }
    if(check==0)
       return word;
    else
    {
        int a=0;
        int b=i;
        int temp;
        while(a<b)
        {
            temp=word[a];
            word[a]=word[b];
            word[b]=temp;
            a++;
            b--;
        }
        return word;
    }
     
}