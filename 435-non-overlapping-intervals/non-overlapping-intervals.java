class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,
            (arr1, arr2) -> Integer.compare(arr1[1], arr2[1])
        );
                Arrays.stream(intervals).forEach(arr -> System.out.println("[" + arr[0] + ", " + arr[1] + "]"));

        int last = intervals[0][0];
        int count = 0;
        for(int[] i: intervals){
            if(i[0] < last){
                count ++;
            }
            else{
                last = i[1];
            }
        }
        return count;
    }
}