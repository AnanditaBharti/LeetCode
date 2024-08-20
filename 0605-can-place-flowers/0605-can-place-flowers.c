bool canPlaceFlowers(int* flowerbed, int flowerbedSize, int n) {

    for (int i=0;i<flowerbedSize ;i++)//i=6,n=1
    {
        if(n==0)
           return true;
        if(flowerbed[i]==1){
          i++;
          continue;
        }
        if(flowerbed[i]==0 )
        {
            if((i+1)>=flowerbedSize || flowerbed[i+1]==0){
            n--;
            i++;
            }
        }
        
    }
    if ( n==0 )
       return true;
    return false;
}