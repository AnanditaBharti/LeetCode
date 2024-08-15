class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length())
           return false;
        StringBuilder sb=new StringBuilder(t);
        for(char i:s.toCharArray())
        {
            int a=sb.indexOf(""+i);
            if(a==-1)
               return false;
            sb.deleteCharAt(a);
        }
        return true;
    }
}