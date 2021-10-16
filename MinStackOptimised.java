package Stack;

import java.util.Stack;

public class MinStackOptimised {
    private Stack<Integer> stack = new Stack<>();
    private Stack<int[]> minStack = new Stack<>();

    public MinStackOptimised() {
    }

    public void push(int val) {
        stack.push(val);

        if (minStack.isEmpty() || val < minStack.peek()[0]) {
            minStack.push(new int[]{val, 1});
        } else if (val == minStack.peek()[0]) {
            minStack.peek()[1]++;
        }
    }

    public void pop() {
        if (stack.peek() == minStack.peek()[0]) {
            minStack.peek()[1]--;
        }

        if (minStack.peek()[1] == 0)
            minStack.pop();
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek()[0];
    }

    public static void main(String[] args) {
        MinStackOptimised mStack = new MinStackOptimised();
        mStack.push(-2);
        mStack.push(0);
        mStack.push(-3);
        System.out.println(mStack.getMin());
        mStack.pop();
        System.out.println(mStack.top());
        System.out.println(mStack.getMin());
    }

}
