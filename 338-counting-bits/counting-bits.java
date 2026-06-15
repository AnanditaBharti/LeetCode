class Solution {
    void helper(int n, int[] ans){
        for(int i = 1; i <= n; i++){
            int q = i / 2;
            int r = i % 2;
            ans[i] = r + ans[q];
        }       
    }
    public int[] countBits(int n) {
        int[] ans =  new int[n + 1];
        helper(n,ans);
        return ans;
    }
}