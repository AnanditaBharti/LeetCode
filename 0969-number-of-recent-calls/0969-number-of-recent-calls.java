class RecentCounter {
    Deque<Integer> queue ;
    public RecentCounter() {
      queue = new ArrayDeque<>();  
    }
    
    public int ping(int t) {
        queue.add(t);
        int totEle = queue.size();
        int min = t - 3000;
        int index = 0; 
        for(int ele : queue){
            if(ele >= min){
                break;
            }
            index ++;
        }
        return totEle - index;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */