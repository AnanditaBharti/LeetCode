class Solution {
    public int maxFreeTime(int eventTime, int k, int[] startTime, int[] endTime) {
        int maxSum = 0;
        int windowSum = 0;
        int n = startTime.length;
        Deque<Integer> window = new ArrayDeque<>();
        if(startTime[0] != 0){
            window.add(startTime[0]);
            windowSum = maxSum = startTime[0];
        }
        for(int i = 1; i < n; i++){
            int freeTime = startTime[i] - endTime[i - 1];
            window.add(freeTime);
            windowSum += freeTime;
            if(window.size() > k + 1){
                windowSum -= window.remove();
            }
            if(windowSum > maxSum){
                maxSum = windowSum;
            }
        }
        if(endTime[n - 1] < eventTime){
            int freeTime = eventTime - endTime[n - 1];
            window.add(freeTime);
            windowSum += freeTime;
            if(window.size() > k + 1){
                windowSum -= window.remove();
            }
            if(windowSum > maxSum){
                maxSum = windowSum;
            }
        }
        return maxSum;
    }
}