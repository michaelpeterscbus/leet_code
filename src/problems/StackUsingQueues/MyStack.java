package problems.StackUsingQueues;

import java.util.LinkedList;
import java.util.Queue;

//MyStack class as explained on LC
public class MyStack {
	
    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();
    private int top;
    
    /** Initialize your data structure here. */
    public MyStack() {

    }
    
    /** Push element x onto stack. */
    public void push(int x) {
    	//the new element is always added to the rear of q1 and is kept as top 
        q1.add(x);
        top = x;
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
    	int theTop = top;
    	//top element will be the last inserted element in q1
        while(q1.size() > 1) {
        	top = q1.remove();
        	q2.add(top); //temporary storage to enqueue removed elements from q1
        }
        
        q1.remove(); //the last element in q1, or the top of the stack
        //swap q1 with q2 to avoid copying all elements over
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return theTop;
    }
    
    /** Get the top element. */
    public int top() {
    	//the top element is kept in constant memory and is modified with each push or pop
        return top;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        //q1 always contains all stack elements
    	return q1.isEmpty();
    }
}
