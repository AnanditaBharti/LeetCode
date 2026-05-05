class Solution {
    void helper(int m, int n, int[][] dp, int r, int c){
        if(r < m - 1){
            if(dp[r + 1][c] == 0)
                helper(m, n, dp, r + 1, c);
            dp[r][c] += dp[r + 1][c];
        }
        if(c < n - 1){
            if(dp[r][c + 1] == 0)
                helper(m, n, dp, r, c + 1);
            dp[r][c] += dp[r][c + 1];
        }
    }
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        dp[m - 1][n - 1] = 1;
        helper(m, n, dp, 0, 0);
        return dp[0][0];
    }
}