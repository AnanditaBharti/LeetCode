class Solution {
    public long totalCost(int[] costs, int k, int candidates) {

        int n = costs.length;

        if(2 * candidates >= n){
            Arrays.sort(costs);
            return Arrays.stream(costs).limit(k).sum();
        }

        PriorityQueue<Integer> leftMinHeap = new PriorityQueue<>();
        PriorityQueue<Integer> rightMinHeap = new PriorityQueue<>();
        int left = 0;
        int right = n - 1;

        for(int i = 0; i < candidates; i++){
            leftMinHeap.offer(costs[left++]);
        }
        for(int i = 0; i < candidates; i++){
            rightMinHeap.offer(costs[right--]);
        }

        long totalCost = 0;

        for(int i = 0; i < k; i++){
            if(rightMinHeap.isEmpty() || (!leftMinHeap.isEmpty() && (leftMinHeap.peek() <= rightMinHeap.peek()))){

                totalCost += leftMinHeap.poll();

                if(left <= right)
                    leftMinHeap.offer(costs[left++]);
            }
            else{
                totalCost += rightMinHeap.poll();

                if(left <= right)
                    rightMinHeap.offer(costs[right--]);
            }
        }
        return totalCost;


        // int n = costs.length;
        // PriorityQueue<Integer> leftMinHeap = new PriorityQueue<>(
        //     (a,b) -> Integer.compare(costs[a], costs[b])
        // );
        // PriorityQueue<Integer> rightMinHeap = new PriorityQueue<>(
        //     (a,b) -> Integer.compare(costs[a], costs[b])
        // );
        // long totalCost = 0;
        // int l = 0;
        // int r = n - 1;
        // for(int i = 0; i < k; i++){
        //     while(l <= r && leftMinHeap.size() < candidates){
        //         leftMinHeap.offer(l);
        //         l ++;
        //     }
        //     while(l <= r && rightMinHeap.size() < candidates){
        //         rightMinHeap.offer(r);
        //         r --;
        //     }

        //     int lowestCost = 0;
        //     int first = (leftMinHeap.peek() == null) ? Integer.MAX_VALUE : costs[leftMinHeap.peek()];
        //     int last = (rightMinHeap.peek() == null) ? Integer.MAX_VALUE : costs[rightMinHeap.peek()];

        //     if(first <= last){
        //         lowestCost = leftMinHeap.poll();
        //     }
        //     else{
        //         lowestCost = rightMinHeap.poll();
        //     }
        //     totalCost += costs[lowestCost];
        // }
        // return totalCost;
    }
}