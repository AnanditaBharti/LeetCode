class Solution {
    public void helper(StringBuilder currString, int open, int close, int n, List<StringBuilder> res) {
        if (open == n && close == n) {
            res.add(currString);
            return;
        }
        // StringBuilder temp = currString;
        if (open < n) {
            helper (new StringBuilder(currString + "("), open + 1, close, n, res) ;
            // temp = currString;
        }
        if (close < open) {
            helper (new StringBuilder(currString + ")"), open, close + 1, n, res) ;
        }
        
    }
    public List<String> generateParenthesis(int n) {
        List<StringBuilder> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        helper(sb, 0, 0, n, res);
        return res.stream().map(StringBuilder::toString).toList();
    }
}