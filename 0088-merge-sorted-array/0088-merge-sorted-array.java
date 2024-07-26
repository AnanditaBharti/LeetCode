class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p=0,q=0;
        int[] temp=new int[m+n];
        for(int i=0;i<m+n;i++)
        {
            if(p<m && q<n && nums1[p]<= nums2[q])
            {
                temp[i]=nums1[p];
                p++;
            }
            else if ( q<n )
            {
                temp[i]=nums2[q];
                q++;
            }
            else if(p<m)
            {
                temp[i]=nums1[p];
                p++;
            }
            
        }

        for(int i=0;i<m+n;i++)
		{
        	nums1[i]=temp[i];
		}
    }
}