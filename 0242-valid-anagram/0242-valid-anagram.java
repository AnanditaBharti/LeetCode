class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length())
           return false;
        char[] arr=s.toCharArray();
        Arrays.sort(arr);
        s=new String(arr);
        arr=t.toCharArray();
        Arrays.sort(arr);
        t=new String(arr);
        if(s.equals(t))
           return true;
        return false;
    }
}