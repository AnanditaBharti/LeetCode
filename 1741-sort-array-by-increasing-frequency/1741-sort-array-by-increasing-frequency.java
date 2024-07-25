class Solution {
    public int[] frequencySort(int[] nums) {
        int res[]=new int[nums.length];
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int i:nums){
            if(hm.containsKey(i))
            {
                hm.put(i,hm.get(i)+1);
            }
            else
            {
                hm.put(i,1);
            }
        }
        int index=0;
        HashSet<Integer> hs=new HashSet<>();
        for(int i:hm.values())
        {
            hs.add(i);
        }
        while(!hs.isEmpty())
        {
            int i=Collections.min(hs);
            ArrayList<Integer> arr=new ArrayList<>();
            for(int j:hm.keySet())
            {
                if(hm.get(j)==i)
                {
                    arr.add(j);
                }
            }
            Collections.sort(arr);
            for(int j=arr.size()-1;j>=0;j--)
            {
                int temp=i;
                for(int k=0;k<temp;k++)
                {
                    res[index++]=arr.get(j);
                }
                
            }
            hs.remove(i);
        }
        return res;
    }
}