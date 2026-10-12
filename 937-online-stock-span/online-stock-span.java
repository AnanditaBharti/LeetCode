class StockSpanner {
    ArrayDeque<int[]> stack;
    public StockSpanner() {
        stack = new ArrayDeque<>();
    }
    
    public int next(int price) {
        int[] pair = {price, 1};
        while(stack.peek() != null && stack.peek()[0] <= price)
            pair[1] += stack.pop()[1];
        stack.push(pair);
        return pair[1];
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */