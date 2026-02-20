class Solution {

    public long maxScore(int[] nums1, int[] nums2, int k) {

        int n = nums1.length;
        int[][] pairs = new int[n][2];

        for(int i = 0; i < n; i++){
            pairs[i][0] = nums1[i];
            pairs[i][1] = nums2[i];
        }

        Arrays.sort(pairs, (a, b) -> Integer.compare(b[1], a[1]));

        long max = 0;
        long currSum = 0;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int i = 0; i < n; i++){
            currSum += pairs[i][0];
            minHeap.offer(pairs[i][0]);
            if(i >= k){
                currSum -= minHeap.poll();
                
            }

            

            if(i >= k - 1){
                max = Math.max(max, currSum * pairs[i][1]);
            }

        }

        return max;
    }
}