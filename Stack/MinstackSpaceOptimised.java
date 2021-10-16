package Stack;

/*
Initialize a structure newStack and create a function push() in it which accepts an integer as a parameter.
Check if the stack is empty, store the integer in a variable min, insert the integer in stack and return.
Else if integer is less than min insert 2*x – min in stack and update min as x.
Else push the integer in stack.
Create the function pop(). Check if stack is empty print “Stack is empty” and return.
Else store the element at top of stack in a variable t and pop/remove the top element from stack.
Check if t is less than min print min and update min as 2*min – t.
Else print t.
Create the function getMin() and check if the stack is empty print “Stack is empty”.
Else return the minimum element.
*/

import java.util.Stack;

public class MinstackSpaceOptimised {

    Stack<Integer> stack;
    int minEle;

    public MinstackSpaceOptimised(){
        this.stack = new Stack<>();
    }

    public void push(int x){
        if(stack.isEmpty()){
            minEle = x;
            stack.push(x);
        }
        else if(x < minEle){
            stack.push(2*x - minEle);
            minEle = x;
        }
        else
            stack.push(x);
    }

    public void pop(){
        int t;
        if(stack.isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        t = stack.pop();

        if(t < minEle){
            System.out.println(minEle);
            minEle = 2*minEle - t;
        }
        else
            System.out.println(t);


    }

    public void getMin(){
        if (stack.isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        else
            System.out.println(minEle) ;
    }

    public static void main(String[] args){
        MinstackSpaceOptimised s = new MinstackSpaceOptimised();

        s.push(30);
        s.push(20);
        s.push(10);
        s.getMin();
        s.pop();
        s.getMin();

    }

}
