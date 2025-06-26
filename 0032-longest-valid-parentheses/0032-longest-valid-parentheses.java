class Solution {
    public int longestValidParentheses(String s) {
        int n = s.length();
        int max = 0;// 0,  
        Deque<Integer> stack = new ArrayDeque<>();  
        stack.push(-1);
        int start = -1;
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == '('){
                stack.push(i);
            }
            else{
                int x = stack.pop();
                if(stack.isEmpty()){
                    stack.push(i);
                }
                else{
                    max = Math.max(max, i - stack.peek());
                }
                // if(stack.peek() != start){
                //     int x = stack.pop();
                //     max = Math.max(max, i - stack.peek());
                // }
                // else{
                //     stack.push(i);
                //     start = i;
                // }
            }
        }
        return max;
    }
}