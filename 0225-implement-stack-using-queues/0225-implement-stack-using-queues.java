class MyStack {
    ArrayDeque<Integer> ad;
    public MyStack() {
        ad=new ArrayDeque<>();
    }
    
    public void push(int x) {
        ad.addLast(x);
    }
    
    public int pop() {
        return ad.removeLast();
    }
    
    public int top() {
        return ad.peekLast() ;
    }
    
    public boolean empty() {
        return ad.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */