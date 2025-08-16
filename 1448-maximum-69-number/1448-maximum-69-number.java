class Solution {
    public int maximum69Number (int num) {
        StringBuilder res = new StringBuilder(String.valueOf(num));
        for(int i = 0; i < res.length(); i++){
            if(res.charAt(i) == '6'){
                res.setCharAt(i, '9');
                break;
            }
        }
        return Integer.parseInt(res.toString());
    }
}