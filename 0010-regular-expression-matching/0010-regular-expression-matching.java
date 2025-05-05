class Solution {
    public boolean isMatch(String s, String p) {
        boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];
        dp[0][0] = true;
        for(int j = 2; j < p.length() + 1; j += 2){
            if(p.charAt(j - 1) == '*'){
                dp[0][j] = dp[0][j - 2];
            }
            else {
                break;
            }
        }
        for(int i = 1; i <= s.length(); i++){
            for(int j = 1; j <= p.length(); j++){
                if(p.charAt(j - 1) == '*') {
                    dp[i][j] = dp[i][j - 2];
                    if((! dp[i][j]) && (s.charAt(i - 1) == p.charAt(j - 2) || p.charAt(j - 2) == '.')) {
                        dp[i][j] = dp[i - 1][j];
                    }
                }
                else if(p.charAt(j - 1) == '.' || p.charAt(j - 1) == s.charAt(i - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                }
            //     if(p.charAt(j - 1) == '.'){
            //         dp[i][j] = dp[i - 1][j - 1];
            //     }
            //     else if(p.charAt(j - 1) == '*'){
            //         if(p.charAt(j - 1 - 1) == '.'){
            //             for(int k = 0; k < i; k++){
            //                 if(dp[k][j - 2]){
            //                     dp[i][j] = true;
            //                     break;
            //                 }
            //             }
            //             break;
            //         }
            //         dp[i][j] = dp[i][j-2] || dp[i][j - 1];
            //         if(!dp[i][j]){
            //             if (s.charAt(i - 1) == p.charAt(j - 1 - 1)) {
            //                 int temp = i;
            //                 while(temp > 0 && s.charAt(temp -1) == p.charAt(j - 1 - 1)){
            //                     temp --;
            //                 }
            //                 dp[i][j] = dp[temp][j - 2];
            //             }
                        
            //         }
                    
            //     }
            //     else{
            //         dp[i][j] = dp[i - 1][j - 1] && (s.charAt(i - 1) == p.charAt(j - 1));
            //     }
            }
        }
        for(int i = 0; i <= s.length(); i++){

            for(int j = 0; j <= p.length(); j++){
                System.out.print(dp[i][j]+",");
            }
            System.out.println();
        }
        return dp[s.length()][p.length()];
    }
}