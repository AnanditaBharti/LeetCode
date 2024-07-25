int compareVersion(char* version1, char* version2) {
    
    char* saveptr1;
    char* saveptr2;
    char* revision1=strtok_r(version1,".",&saveptr1);
    char* revision2= strtok_r(version2,".",&saveptr2);
    int num1=atoi(revision1);
    int num2=atoi(revision2);
    while(1)
    {
        if(num1<num2)
           return -1;
        else if(num1>num2)
           return 1;
        revision1 = strtok_r(NULL,".",&saveptr1);
        revision2 = strtok_r(NULL,".",&saveptr2);
        if(revision1==NULL && revision2!=NULL)
        {
            int count=0;
            while(1)
            {
                num2=atoi(revision2);
                if(num2>0)
                   return -1;
                revision2 = strtok_r(NULL,".",&saveptr2);
                if(revision2==NULL)
                  return 0;
            }
            
        }
        else if(revision1!=NULL && revision2==NULL)
        {
            int count=0;
            while(1)
            {
                num1=atoi(revision1);
                if(num1>0)
                   return 1;
                revision1 = strtok_r(NULL,".",&saveptr1);
                if(revision1==NULL)
                  return 0;
            }
        }
        else if(revision1==NULL && revision2==NULL)
           return 0;
        num1=atoi(revision1);
        num2=atoi(revision2);
        
    }
    //return 0;
}