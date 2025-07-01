class Solution {
    public int possibleStringCount(String word) {
        // HashSet<Character
        int count = 0;
        char prev = word.charAt(0);
        for(int i = 1; i < word.length(); i++){
            char present = word.charAt(i);
            if(present == prev){
                count++;
            }
            else{
                prev = present;
            }
        }
        count ++;
        return count;
    }
}