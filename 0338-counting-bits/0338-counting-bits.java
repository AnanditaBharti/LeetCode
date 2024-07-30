class Solution {
    public int[] countBits(int n) {
         int arr[]=new int[n+1];
        // for(int i=0;i<n+1;i++)
        // {
        //     int j=i;
        //     int count=0;
        //     while(j!=0)
        //     {
        //         if(j%2==1)
        //           count++;
        //         j/=2;
        //     }
        //     arr[i]=count;
        // }
        // return arr;
        arr[0]=0;
        if(n>=1)
          arr[1]=1;
        for(int i=2;i<n+1;i++)
        {
            if(i%2==1)
               arr[i]=arr[i/2]+1;
            else
               arr[i]=arr[i/2];
        }
        return arr;
    }
}