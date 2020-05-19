class StockSpanner {
    Stack<Integer> cost, span;
    public StockSpanner() {
        cost = new Stack();
        span = new Stack();
    }
    
    public int next(int price) {
        int ans = 1;
        while(!cost.isEmpty() && cost.peek() <= price){
            cost.pop();
            ans += span.peek();
            span.pop();
            //System.out.println(span.peek());
        }
        cost.push(price);
        //System.out.println(ans);
        span.push(ans);
        return ans;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */