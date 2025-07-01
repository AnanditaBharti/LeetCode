class Solution {
    public boolean isMatch(String s, String p) {
        boolean[][] dp = new boolean[p.length() + 1][s.length() + 1];
        dp[0][0] = true;
        for(int i = 1 ; i <= p.length(); i++){
            if(p.charAt(i - 1) == '*'){
                dp[i][0] = true;
            }
            else{
                break;
            }
        }
        for(int i = 1 ; i <= p.length(); i++){
            for(int j = 1; j <= s.length(); j++){
                if(p.charAt(i - 1) == s.charAt(j - 1)){
                    dp[i][j] = dp[i - 1][j - 1];
                }
                else if(p.charAt(i - 1) == '?'){
                    dp[i][j] = dp[i - 1][j - 1];
                }
                else if(p.charAt(i - 1) == '*'){
                    dp[i][j] = dp[i - 1][j] || dp[i][j - 1];
                }
            }
        }
        // for(int i = 0 ; i <= p.length(); i++){
        //     for(int j = 0; j <= s.length(); j++){
        //         System.out.print(dp[i][j]+" , ");
        //     }
        //     System.out.println();
        // }
        return dp[p.length()][s.length()];
    }
}