class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        int n = costs.length;
        PriorityQueue<Integer> leftMinHeap = new PriorityQueue<>(
            (a,b) -> Integer.compare(costs[a], costs[b])
        );
        PriorityQueue<Integer> rightMinHeap = new PriorityQueue<>(
            (a,b) -> Integer.compare(costs[a], costs[b])
        );
        long totalCost = 0;
        int l = 0;
        int r = n - 1;
        for(int i = 0; i < k; i++){
            while(l <= r && leftMinHeap.size() < candidates){
                leftMinHeap.offer(l);
                l ++;
            }
            while(l <= r && rightMinHeap.size() < candidates){
                rightMinHeap.offer(r);
                r --;
            }

            int lowestCost = 0;
            int first = (leftMinHeap.peek() == null) ? Integer.MAX_VALUE : costs[leftMinHeap.peek()];
            int last = (rightMinHeap.peek() == null) ? Integer.MAX_VALUE : costs[rightMinHeap.peek()];

            if(first <= last){
                lowestCost = leftMinHeap.poll();
            }
            else{
                lowestCost = rightMinHeap.poll();
            }
            totalCost += costs[lowestCost];
        }
        return totalCost;
    }
}