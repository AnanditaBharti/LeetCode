class Solution {
    public int[] plusOne(int[] digits) {
         int len=digits.length;
        // int num=0;
        // for(int i=0;i<len;i++)
        // {
        //     num=num*10+digits[i];
        // }
        // num++;
        // int new_len=Integer.toString(num).length();
        // // if(len==new_len)
        // // {
        // //     digits[len]++;
        // //     return 
        // // }
        // int arr[]=new int[new_len];
        // for(int i=arr.length-1;i>=0;i--)
        // {
        //     arr[i]=num%10;
        //     num/=10;
        // }
        // return arr;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=len-1;i>=0;i--)
        {
            arr.add(digits[i]);
        }
        int i=0;
        int a=1;
        int x=0;
        while(true)
        {
            if(i>=arr.size())
               break;
            x=arr.get(i);
            if(x==9)
            {
                arr.set(i,0);
                i++;
            }
            else
            {
                arr.set(i,x+1);
                a=0;
                break;
            }
        }
        if(a==1)
        {
            arr.add(1);
        }
        i=0;
        int res[]=new int[arr.size()];
        for(int j=arr.size()-1;j>=0;j--)
        {
            res[j]=arr.get(i);
            i++;
        }
        return res;
    }
}