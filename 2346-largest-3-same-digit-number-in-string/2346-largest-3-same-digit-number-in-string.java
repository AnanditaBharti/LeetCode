class Solution {
    public String largestGoodInteger(String num) {
        char prev = num.charAt(0); 
        int count = 1;
        int max = -1;
        for(int i = 1; i < num.length(); i++){ 
            char curr = num.charAt(i); 
            if(curr == prev){
                count ++;
            }
            else{
                prev = curr;
                count = 1;
            }
            if(count == 3){
                int good = curr - '0';
                if(good > max){
                    max = good;
                }
                count = 0;
            }
        }
        return (max == -1) ? "" : "" + max + max + max;
    }
}