class Solution {
    public static HashMap<Character,Integer> mapCharactersInAWordWithItsOccurence(String word){
        HashMap<Character,Integer> result = new HashMap<>();
        for(int i = 0 ; i < word.length() ; i++){
            char ele = word.charAt(i) ;
            if ( result.containsKey(ele) ){
                result.put(ele,result.get(ele)+1);
            }
            else{
                result.put(ele,1);
            }
        }
        return result ;
    }
    public boolean closeStrings(String word1, String word2) {
        if ( word1.length() != word2.length() )
            return false;
        HashMap<Character,Integer> countCharactersInWord1 = mapCharactersInAWordWithItsOccurence(word1);
        HashMap<Character,Integer> countCharactersInWord2 = mapCharactersInAWordWithItsOccurence(word2);
        if ( countCharactersInWord1.size() != countCharactersInWord2.size() )
            return false ;
        
        if ( !countCharactersInWord1.keySet().equals(countCharactersInWord2.keySet()) )
            return false ;
        // Iterator<Map.Entry<Character, Integer>> iterator = countCharactersInWord1.entrySet().iterator();
        // while( iterator.hasNext() ){

        // }

        List<Integer> frequency1 = countCharactersInWord1.values().stream().sorted().toList() ;
        List<Integer> frequency2 = countCharactersInWord2.values().stream().sorted().toList() ;
        return frequency1.equals(frequency2) ;
        
    }
}