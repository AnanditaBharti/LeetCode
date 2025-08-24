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

        // Deque<Integer> stack = new ArrayDeque<>();
        // for(int i = 0; i < asteroids.length; i++){
        //     System.out.print(i + "[");
        //     int currEle = asteroids[i]; //-2
        //     if(stack.isEmpty()){
        //         stack.push(currEle);
        //         System.out.println("]");
        //         continue;
        //     }
        //     if(currEle < 0){
        //         int preEle = stack.peek(); //1

        //         // System.out.println(preEle);

        //         while(preEle > 0){
        //             while(Math.abs(currEle) >= preEle){
        //                 stack.pop();
        //                 if(stack.isEmpty()){
        //                     break;
        //                 }
        //                 preEle = stack.peek();
        //             }
        //         }
        //         else{
        //             stack.push(currEle);
        //         }
        //     }
        //     else {
        //         stack.push(currEle);
        //     }
        //     stack.stream().forEach(ele -> System.out.print(ele+ ","));
        //     System.out.println("]");
        // }
        // int[] res = new int[stack.size()];
        // int j = stack.size() - 1;
        // for(Integer i: stack){
        //     res[j] = i;
        //     j--;
        // }
        // return res;
    }
}