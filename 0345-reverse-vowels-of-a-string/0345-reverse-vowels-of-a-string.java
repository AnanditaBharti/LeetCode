class Solution {
    public StringBuffer swap(StringBuffer sb, int i, int j)
    {
        char a=sb.charAt(i);
        sb.setCharAt(i,sb.charAt(j));
        sb.setCharAt(j,a);
        // System.out.println(sb+" "+i+" "+j);
        return sb;
    }
    public String reverseVowels(String s) {
        StringBuffer sb = new StringBuffer(s);
        StringBuffer sb2 = new StringBuffer();
        int first=-1;
        char prev='f';
        HashSet<Character> vowels = new HashSet<>();
        vowels.addAll(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        HashSet<Character> index = new HashSet<>();
        for(int i=0,j=s.length()-1;i<j;)
        {
            while(i<s.length() && !vowels.contains(s.charAt(i)))
              i++;
            while(j>-1 && !vowels.contains(s.charAt(j)))
              j--;
            if(i<j){
              sb=swap(sb,i,j);
              i++;
              j--;
            }
            else 
              break;

        }
        return sb.toString();
    }
}