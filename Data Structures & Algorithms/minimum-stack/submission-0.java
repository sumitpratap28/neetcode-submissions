class MinStack {
  Stack<Integer> st;
  Stack<Integer> minSt;
    public MinStack() {
        st = new Stack<Integer>();
        minSt = new Stack<Integer>();
    }
    
    public void push(int val) {
        if(minSt.isEmpty() || val<minSt.peek()){
            minSt.push(val);
        }else {
            minSt.push(minSt.peek());
        }
        st.push(val);
    }
    
    public void pop() {
        st.pop();
        minSt.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minSt.peek();
    }
}
