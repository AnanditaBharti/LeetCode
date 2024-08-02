class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
           return false;
        HashMap<Character,Character> hm1 = new HashMap<>();
        HashSet<Character> hs =new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            if(hm1.containsKey(s.charAt(i)))
            {
                if(t.charAt(i)!=hm1.get(s.charAt(i)))
                {
                    return false;
                }
            }
            else
            {
                if(hs.contains(t.charAt(i)))
                   return false;
                
                hm1.put(s.charAt(i),t.charAt(i));
                hs.add(t.charAt(i));
            }
        }
        return true; 
    //     HashMap<Character,Integer> hm2 = new HashMap<>();
    //     for(char i:s.toCharArray())
    //     {
    //         if(hm1.containsKey(i))
    //         {
    //             hm1.put(i,hm1.get(i)+1);
    //         }
    //         else
    //         {
    //             hm1.put(i,1);
    //         }
    //     }
    //     for(char i:t.toCharArray())
    //     {
    //         if(hm2.containsKey(i))
    //         {
    //             hm2.put(i,hm2.get(i)+1);
    //         }
    //         else
    //         {
    //             hm2.put(i,1);
    //         }
    //     }
    //     for(int i:hm1.keySet())
    //     {
    //         for(int j:hm2.keySet())
    //         {
    //             if(hm1.get(i)==hm2.get(j))
    //             {
    //                 hm2.remove(j);
    //                 break;
    //             }
    //         }
    //     }

     }
}