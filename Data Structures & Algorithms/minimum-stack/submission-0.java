class MinStack {
    public Stack<Integer> stack;
    public Stack<Integer> secondstack;
    public MinStack() {
        stack = new Stack<>();
        secondstack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if(secondstack.isEmpty() || val<=secondstack.peek()){
            secondstack.push(val);
        }
    }

    public void pop() {
        int remove =stack.pop();
        if(remove==secondstack.peek()){
            secondstack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return secondstack.peek();
    }
}
