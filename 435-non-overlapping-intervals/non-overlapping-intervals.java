class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,
            (arr1, arr2) -> {
                if(arr1[1] < arr2[1])
                    return -1;
                if(arr1[1] > arr2[1])
                    return 1;
                return ((arr1[1] - arr1[0]) <= (arr2[1] - arr2[0])) ? -1 : 1;
            }
        );
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