class Solution {
    public String helper(String s, int start, int end) {
        
        if (start > end) {
            return "";
        }
        
        int[] alphabets = new int[26+26];
        for (int i = start; i <= end; i++) {
            if (Character.isLowerCase(s.charAt(i))) {
                
                alphabets[s.charAt(i) - 'a'] = 1;
            }
            else {
                alphabets[26 + s.charAt(i) - 'A'] = 1;
            }
        }


        // for(int i=0 ; i<52 ; i++){
        //     if (alphabets[i] == 1)
        //     System.out.println(i+"-"+alphabets[i]);
        // }
        // System.out.println();
        // System.out.println("aaa");


        List<Integer> breakpoints = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            
            if (Character.isLowerCase(s.charAt(i)) ) {

                // System.out.println(s.charAt(i)+"-"+alphabets[(s.charAt(i) - 'a') % 26]);

                if (alphabets[26 + s.charAt(i) - 'a'] != 1) {
                    breakpoints.add(i);
                }
                // else {
                //     System.out.println(s.charAt(i)+"-"+alphabets[(s.charAt(i) - 'a') % 26]);
                // }


            }
            else {

                // System.out.println(s.charAt(i)+"-"+alphabets[(26 + s.charAt(i) - 'A') % 26]);

                if (alphabets[(s.charAt(i) - 'A') % 26] != 1) {
                    breakpoints.add(i);
                }
            }
        }
        
        // System.out.println(breakpoints);

        if (breakpoints.size() == 0) {
            return s.substring(start,end+1);
        }
        String result = "";
        String temp;
        int left = start;
        int right = end;
        for (int ele : breakpoints){
            temp = helper(s, left, ele - 1);
            if (temp.length() > result.length()) {
                result = temp;
            }
            left = ele + 1;
        }
        temp = helper(s, left, right);
        if (temp.length() > result.length()) {
            result = temp;
        }
        return result;
        
    }
    public String longestNiceSubstring(String s) {
        if(s == null) {
            return null;
        }
        return helper (s,0,s.length() - 1);
    }
}