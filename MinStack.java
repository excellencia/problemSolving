package Stack;


import java.util.Stack;

class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack() {
        this.stack = new Stack<>();
        this.minStack = new Stack<>();

    }

    public void push(int val) {
        stack.add(val);
        val = Math.min(val,minStack.isEmpty() ? val:minStack.peek());
        minStack.add(val);

    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        MinStack mStack = new MinStack();
        mStack.push(-2);
        mStack.push(0);
        mStack.push(-3);
        mStack.getMin();
        mStack.pop();
        mStack.top();
        mStack.getMin();
    }
}
