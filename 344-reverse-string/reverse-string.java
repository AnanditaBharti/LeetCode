class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        for(int i = n - 1, j = 0; i > j; i--, j++){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
    }
}