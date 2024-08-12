class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> al = new ArrayList<>();
        int low=0,high=0,next=0;
        boolean check=false;
        for(int i=0;i<nums.length;i++)
        {
            if(!check)
            {
                low=high=nums[i];
                check=true;
                next=low+1;
            }
            else if(check && nums[i]==next)
            {
                high=nums[i];
                next=nums[i]+1;
            }
            else
            {
                if(low==high)
                {
                    al.add(low+"");
                    
                }
                else
                {
                    al.add(low+"->"+high);
                }
                low=high=nums[i];
                    next=low+1;
            }
            if(i==nums.length-1)
            {
                if(low==high)
                {
                    al.add(low+"");
                    
                }
                else
                {
                    al.add(low+"->"+high);
                }
                low=high=nums[i];
                    next=low+1;
            }
        }
        return al;
    }
}