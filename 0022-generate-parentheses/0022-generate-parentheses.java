class Solution {
    // public void helper(StringBuilder currString, int open, int close, int n, List<StringBuilder> res) {
    //     if (open == n && close == n) {
    //         res.add(currString);
    //         return;
    //     }
    //     if (open < n) {
    //         helper (new StringBuilder(currString + "("), open + 1, close, n, res) ;
    //     }
    //     if (close < open) {
    //         helper (new StringBuilder(currString + ")"), open, close + 1, n, res) ;
    //     }
        
    // }


    public List<String> generateParenthesis(int n) {
        // List<StringBuilder> res = new ArrayList<>();
        // StringBuilder sb = new StringBuilder();
        // helper(sb, 0, 0, n, res);
        // return res.stream().map(StringBuilder::toString).toList();

        List<List<String>> validParenthesisAtEachIndex = new ArrayList<>();
        validParenthesisAtEachIndex.add(new ArrayList<>());
        validParenthesisAtEachIndex.get(0).add("");

        for (int i = 1; i <= n; i++) {
            List<String> temp = new ArrayList<>();
            for (int j = 0; j < validParenthesisAtEachIndex.size(); j++) {
                for (String k : validParenthesisAtEachIndex.get(j)) {
                    for (String l : validParenthesisAtEachIndex.get(i - j - 1)) {
                        temp.add( "(" + k + ")" + l );
                    }
                    
                }
            }
            validParenthesisAtEachIndex.add(temp);
        }
        return validParenthesisAtEachIndex.get(n);
    }
}