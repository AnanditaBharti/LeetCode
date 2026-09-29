class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        // HashMap<Integer, Integer> hm = new HashMap<>();
        int n = temperatures.length;
        int[] answer = new int[n];
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(0);
        for(int i = 1; i < n; i++){
            while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]){
                int top = stack.pop();
                answer[top] = i - top;
            }
            stack.push(i);
        }
        while(!stack.isEmpty()){
            answer[stack.pop()] = 0;
        }
        return answer;
    }
}