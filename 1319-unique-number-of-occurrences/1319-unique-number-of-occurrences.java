class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> countOccurenceOfEachElement = new
                 HashMap<>();
        for(int ele : arr){
            if ( countOccurenceOfEachElement.containsKey(ele) ){
                countOccurenceOfEachElement.put(ele,countOccurenceOfEachElement.get(ele)+1);
            }
            else{
                countOccurenceOfEachElement.put(ele,1);
            }
        }
        Set<Integer> uniqueOccurence = countOccurenceOfEachElement.values().stream().distinct()
               .collect(Collectors.toSet());
        if ( uniqueOccurence.size() == countOccurenceOfEachElement.size()) 
           return true ;
        else 
           return false ;
    }
}