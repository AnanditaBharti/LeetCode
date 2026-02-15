class SmallestInfiniteSet {
    PriorityQueue<Integer> queue;

    public SmallestInfiniteSet() {
        queue = new PriorityQueue<>();
        queue.add(1);
    }
    
    public int popSmallest() {
        if(queue.size() == 1){
            queue.add(queue.peek() + 1);
        }
        int ans = queue.remove();
        System.out.println(queue);
        return ans;
        
        
    }
    
    public void addBack(int num) {
        if(num < queue.peek())
            queue.add(num);
        else{
            for(int i: queue){
                if(i == num)
                    return;
                if(i > num){
                    queue.add(num);
                    return;
                }
            }
        }
        System.out.println(queue);
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */