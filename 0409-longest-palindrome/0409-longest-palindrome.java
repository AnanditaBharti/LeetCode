class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> hm= new HashMap<>();
        for(char i: s.toCharArray())
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
        int count=0;
        boolean oddFound=false;
        for(int i:hm.values())
        {
            if(i%2==0)
              count+=i;
            else{
              count+=i-1;
              oddFound=true;
            }
        }
        if (oddFound)
          return count+1;
        else
          return count;
    }
}