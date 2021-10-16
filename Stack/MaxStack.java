package Stack;

import java.util.Stack;

/*Design a max stack data structure that supports the stack operations and supports finding the stack's maximum element.

        Implement the MaxStack class:

        MaxStack() Initializes the stack object.
        void push(int x) Pushes element x onto the stack.
        int pop() Removes the element on top of the stack and returns it.
        int top() Gets the element on the top of the stack without removing it.
        int peekMax() Retrieves the maximum element in the stack without removing it.
        int popMax() Retrieves the maximum element in the stack and removes it. If there is more than one maximum element, only remove the top-most one.*/
public class MaxStack {
    private Stack<Integer> stack = new Stack<>();
    private Stack<int[]> maxStack = new Stack<>();

    public MaxStack(){}

    public void push(int x){
        stack.push(x);

        if(maxStack.isEmpty() || x > maxStack.peek()[0]){
            maxStack.push(new int[]{x, 1});
        }
        else if(x == maxStack.peek()[0]) {
            maxStack.peek()[1]++;
        }
    }

    public int pop(){
        if (stack.peek().equals(maxStack.peek()[0]))
            maxStack.peek()[1]--;
        if(maxStack.peek()[1] == 0)
            maxStack.pop();
        return stack.pop();
    }

    public int top(){
        return stack.peek();
    }

    public int peekMax(){
        return maxStack.peek()[0];
    }

    public int popMax(){

        int max = peekMax();
        Stack<Integer> buffer = new Stack();
        while(top() != max) buffer.push(pop());
        pop();
        while(!buffer.isEmpty()) push(buffer.pop());
        return max;
    }

    public static void main(String[] args) {
        MaxStack mStack = new MaxStack();
        mStack.push(5);
        mStack.push(1);
        //mStack.push(5);
        //System.out.println(mStack.top());
        System.out.println(mStack.popMax());
        //System.out.println(mStack.top());
        System.out.println(mStack.peekMax());
        //System.out.println(mStack.pop());
        //System.out.println(mStack.top());

    }
}
