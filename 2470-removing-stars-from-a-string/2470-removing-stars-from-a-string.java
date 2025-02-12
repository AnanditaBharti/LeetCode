class Solution {
    public String removeStars(String s) {
        Stack<Character> elements = new Stack<>();
        for(int i = 0; i < s.length() ; i++){
            if (s.charAt(i) == '*'){
                elements.pop();
            }
            else{
                elements.push(s.charAt(i));
            }
        }
        String result = "" ;
        for(Character c : elements){
            result += c ;
        }
        return result ;
    }
}