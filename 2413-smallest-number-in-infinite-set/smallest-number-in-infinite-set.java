class SmallestInfiniteSet {

    PriorityQueue<Integer> queue;
    HashSet<Integer> set;
    int current;

    public SmallestInfiniteSet() {
        queue = new PriorityQueue<>();
        set = new HashSet<>();
        current = 1;
   }
    
    public int popSmallest() {
        if(!queue.isEmpty()){
            int ans = queue.remove();
            set.remove(ans);
            return ans;
        }
        return current ++;
        // if(queue.size() == 1){
        //     queue.add(queue.peek() + 1);
        // }
        // int ans = queue.remove();
        // return ans;
        
        
    }
    
    public void addBack(int num) {
        if(num < current && !set.contains(num)){
            queue.add(num);
            set.add(num);
        }
        // if(num < queue.peek())
        //     queue.add(num);
        // else{
        //     for(int i: queue){
        //         if(i == num)
        //             return;
        //         if(i > num){
        //             queue.add(num);
        //             return;
        //         }
        //     }
        // }
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */