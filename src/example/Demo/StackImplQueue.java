package example.Demo;

import java.util.Stack;

public class StackImplQueue {

    Stack<Integer> stack1;
    Stack<Integer> stack2;
    int size;

    /** Initialize your data structure here. */
    public StackImplQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
        size = 0;
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stack1.push(x);
        size++;
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        int res = stack2.pop();
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return res;
    }

    /** Get the front element. */
    public int peek() {
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        int res = stack2.peek();
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return res;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        if (size == 0)
            return true;
        else
            return false;
    }
}
