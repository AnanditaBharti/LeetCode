class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        // List<Integer> distinctIntegersInNums1 = Arrays.asList(nums1);
        Set<Integer> distinctIntegersInNums1 = Arrays.stream(nums1) 
                                                       .boxed()
                                                       .collect(Collectors.toSet()); 
        Set<Integer> distinctIntegersInNums2 = Arrays.stream(nums2) 
                                                       .boxed()
                                                       .collect(Collectors.toSet());
        Iterator<Integer> iterate = distinctIntegersInNums1.iterator() ;
        while(iterate.hasNext()){
            Integer value = iterate.next() ;
            if(distinctIntegersInNums2.contains(value)){
                iterate.remove();
                distinctIntegersInNums2.remove(value);
            }
        }
        List<List<Integer>> answer = new ArrayList<>() ;
        answer.add(new ArrayList<>(distinctIntegersInNums1));
        answer.add(new ArrayList<>(distinctIntegersInNums2));
        return answer;
    }
}