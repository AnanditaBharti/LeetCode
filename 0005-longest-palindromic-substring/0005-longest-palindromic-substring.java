class Solution {
    // boolean isPalindrome(String s){

    // }
    public String longestPalindrome(String s) {
        int n = s.length();
        if(n < 1)
           return null;
        boolean[][] isPalindrome = new boolean[n][n] ;
        // for(int i = 0 ; i < n ; i++ ){
        //     isPalindrome[i][i] = true ;
        // }
        // for(int i = 0 ; i < n ; i++ ){
        //     for(int j = i+1 ; j < n ; j++ ){
        //         if(i == j)
        //            continue ;
        //         isPalindrome[i][j] = (s.charAt(i) == s.charAt(j)) && (isPalindrome[])
        //     }
        // }

        int i = 0;
        int j = 0;

        int sizeOfLongestPalindrome = 1;
        String longestPalindrome = s.charAt(0)+"";
        while(j < n){
            // if(i == j){
            //     isPalindrome[i][i] = true ;
            // }
            int row = i;
            int col = j;
            while(col < n){
                if(row == col){
                    isPalindrome[row][col] = true ;
                    // continue;
                }
                else {
                    isPalindrome[row][col] = (s.charAt(row) == s.charAt(col)) 
                                               && (((row+1) < (col-1)) ? 
                                               isPalindrome[row+1][col-1] : true) ;
                    if(isPalindrome[row][col]){
                        if((col - row + 1) > sizeOfLongestPalindrome){
                            sizeOfLongestPalindrome = col - row + 1 ;
                            longestPalindrome = s.substring(row,col+1) ;
                        }
                    }
                } 
                row ++ ;
                col ++ ;
            }
            j++ ;
        }
        return longestPalindrome;
    }
}