class Solution {
    public int gcd(int a,int b)
    {
        if(a%b==0)
          return b;
        else
          return gcd(b,a%b);
    }
    public String gcdOfStrings(String str1, String str2) {
        int a=str1.length();
        int b=str2.length();
        int com=gcd(a,b);
        String prefix=str1.substring(0,com);
        if(prefix.repeat(a/com).equals(str1) && prefix.repeat(b/com).equals(str2))
           return prefix;
        else
           return "";
    }
}