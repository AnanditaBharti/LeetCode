class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        // List<Integer> distinctIntegersInNums1 = Arrays.asList(nums1);
        Set<Integer> integersInNums1 = Arrays.stream(nums1) 
                                                       .boxed()
                                                       .collect(Collectors.toSet()); 
        Set<Integer> integersInNums2 = Arrays.stream(nums2) 
                                                       .boxed()
                                                       .collect(Collectors.toSet());
       
        Set<Integer> distinctIntegersInNums1 = new HashSet<>(integersInNums1);
        Set<Integer> distinctIntegersInNums2 = new HashSet<>(integersInNums2);
        distinctIntegersInNums1.removeAll(integersInNums2) ;
        distinctIntegersInNums2.removeAll(integersInNums1) ;
        List<List<Integer>> answer = Arrays.asList(new ArrayList<>(distinctIntegersInNums1), new ArrayList<>(distinctIntegersInNums2));
        return answer;
    }
}