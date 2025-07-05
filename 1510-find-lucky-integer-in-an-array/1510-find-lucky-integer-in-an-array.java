class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> countOccurence = new HashMap<>(); 
        for(int i = 0; i < arr.length; i++){
            int key = arr[i];
            if(countOccurence.containsKey(key)){
                countOccurence.put(key, countOccurence.get(key) + 1);
            }
            else{
                countOccurence.put(key, 1);
            }
        }
        return countOccurence.keySet().stream().sorted(Comparator.reverseOrder()).filter(key -> key == countOccurence.get(key)).findFirst().orElse(-1);
    }
}