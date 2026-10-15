class Solution {
    public int reverse(int x) {
        int res = 0;
        int dig = 0;
        while(x != 0){
            dig = x % 10;
            x /= 10;
            if(res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && dig > Integer.MAX_VALUE % 10))
                return 0;
            if(res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE / 10 && dig < Integer.MIN_VALUE % 10))
                return 0;
            res = res * 10 + dig;
        }
        return res;
    }
}