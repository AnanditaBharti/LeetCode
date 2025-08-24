class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack = new ArrayDeque<>();
        int index = 0;
        while(index < asteroids.length){
            if(stack.isEmpty() || stack.peek() < 0){
                stack.push(asteroids[index]);
                index ++;
            }
            else{
                int top = stack.peek();
                int currEle = asteroids[index];
                if(currEle > 0){
                    stack.push(currEle);
                    index ++;
                }
                else{
                    if(top > Math.abs(currEle)){
                        index ++;
                    }
                    else if(top == Math.abs(currEle)){
                        stack.pop();
                        index ++;
                    }
                    else{
                        stack.pop();
                    }
                }
            }
            
        }
        int[] res = new int[stack.size()];
        int j = stack.size() - 1;
        for(Integer i: stack){
            res[j] = i;
            j--;
        }
        return res;
    }
}