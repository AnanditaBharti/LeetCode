class Solution {
    public int numTilings(int n) {
        if(n < 2)
            return 1;
        if(n == 2)
            return 2;
            
        int mod = 1_000_000_007;

        long[] fullyCovered = new long[n];
        long[] partiallyCovered = new long[n];

        fullyCovered[0] = 1;
        fullyCovered[1] = 2;

        partiallyCovered[0] = 0;
        partiallyCovered[1] = 2;
        
        for(int i = 2; i < n; i++){
            fullyCovered[i] = (fullyCovered[i - 1] + fullyCovered[i - 2] + partiallyCovered[i - 1]) % mod;
            partiallyCovered[i] = (partiallyCovered[i - 1] + 2 * fullyCovered[i - 2]) % mod;
        }

        return (int)fullyCovered[n - 1];
    }
}