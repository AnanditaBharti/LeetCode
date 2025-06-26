class Solution {
    public int longestValidParentheses(String s) {
        int n = s.length();
        int max = 0;// 0,  
        Deque<Integer> stack = new ArrayDeque<>(); //-1, ,  
        stack.push(-1);
        int start = -1;
        for(int i = 0; i < n; i++){ //0, 1, 2,
            if(s.charAt(i) == '('){
                stack.push(i);
            }
            else{
                if(stack.peek() != start){
                    int x = stack.pop();// 1, , 
                    max = Math.max(max, i - stack.peek());
                }
                else{
                    stack.push(i);
                    start = i;
                }
            }
        }
        return max;




        // int validParenthesesCount = 0;//2
        // int max = 0;
        // Deque<Character> stack = new ArrayDeque<>();
        // int[] dp =  new int[n];
        // for(int i = 0; i < s.length(); i++){
        //     if(s.charAt(i) == '(') {
        //         stack.push('(');
        //     }
        //     else{
        //         if(!stack.isEmpty() && stack.peek() == '(') {
        //             stack.pop();
        //             validParenthesesCount += 2;
        //         }
        //         else{
        //             max = Math.max(max, validParenthesesCount);
        //             validParenthesesCount = 0;
        //         }
        //     }
        // }
        // return Math.max(max, validParenthesesCount);
    }
}