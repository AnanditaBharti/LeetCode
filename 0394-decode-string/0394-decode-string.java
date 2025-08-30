class Solution {
    public String decodeString(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char curr = s.charAt(i);
            if(curr == ']'){
                char top = stack.pop();
                StringBuilder subString = new StringBuilder();
                while(top != '['){
                    subString.insert(0, top);
                    top = stack.pop();
                }
                StringBuilder prefix = new StringBuilder();
                while(!stack.isEmpty() && Character.isDigit(stack.peek())){
                    prefix.insert(0, stack.pop());
                }
                int repeat = Integer.parseInt(prefix.toString());
                StringBuilder subString2 = new StringBuilder();
                subString2.repeat(subString, repeat);
                if(!stack.isEmpty()){
                    for(int k = 0; k < subString2.length(); k++){
                        stack.push(subString2.charAt(k));
                    }
                }
                else{
                    result.append(subString2);
                }
            }
            else{
                stack.push(curr);
            }
        }
        StringBuilder left = new StringBuilder();
        while(!stack.isEmpty()){
            left.insert(0, stack.pop());
        }
        result.append(left);
        return result.toString();
    }
}