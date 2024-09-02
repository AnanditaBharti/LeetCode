class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i:nums)
        {
            if(hm.containsKey(i))
            {
                hm.put(i,hm.get(i)+1);

            }
            else
               hm.put(i,1);
        }
        int res=0;
        for(int i:hm.keySet())
        {
            int a=k-i;
            if(i!=a && hm.containsKey(a))
            {
                int m=Math.min(hm.get(i),hm.get(a));
                res+=m;
                hm.put(a,Math.max(0,hm.get(a)-m));
                hm.put(i,0);
            }
            else if(i==a)
            {
                res+=hm.get(a)/2;
            }
        }
        return res;
    }
}