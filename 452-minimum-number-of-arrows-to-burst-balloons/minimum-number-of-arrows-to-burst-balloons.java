class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,
            (arr1, arr2) -> Integer.compare(arr1[1], arr2[1])
        );
        int shots = 1;
        int maxReach = points[0][1];
        for(int i = 1; i < points.length; i++){
            if(points[i][0] > maxReach){
                shots ++;
                maxReach = points[i][1];
            }
        }
        return shots;
    }
}