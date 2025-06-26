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
                if(stack.peek() != start){
                    int x = stack.pop();
                    max = Math.max(max, i - stack.peek());
                }
                else{
                    stack.push(i);
                    start = i;
                }
            }
        }
        return max;
    }
}