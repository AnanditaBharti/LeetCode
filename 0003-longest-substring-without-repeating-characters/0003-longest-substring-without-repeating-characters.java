import java.util.HashSet;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            int temp_max=0;
            HashSet<Character> hs=new HashSet<>();
            for(int j=i;j<s.length();j++)
            {
                if(!hs.contains(s.charAt(j)))
                {
                   hs.add(s.charAt(j));
                   temp_max++;
                }
                else
                {
                    
                    break;
                }   
            }
            count=Math.max(count,temp_max);
        }
        return count;
    }
}