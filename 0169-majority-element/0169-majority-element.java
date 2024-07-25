class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i:nums)
        {
            if(hm.containsKey(i))
            {
                hm.put(i,hm.get(i)+1);
            }
            else
            {
                hm.put(i,1);
            }
        }
        int max=0,freq=0;
        for(int i:hm.keySet())
        {
            if(hm.get(i)>freq)
            {
                max=i;
                freq=hm.get(i);
            }
        }
        return max;
    }
}