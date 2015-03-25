import java.util.Stack;

public class MinStack {
	int min = Integer.MAX_VALUE;
	Stack<Integer> minStack = new Stack<Integer>();
    public void push(int x) {
    	if (x <= min) {
    		minStack.push(min);
    		min = x;
    	}
        minStack.push(x);
    }
    
    public void pop() {
    	if (minStack.peek() == min) {
    		minStack.pop();
    		min = minStack.peek();
    	}
        minStack.pop();
    }

    public int top() {
        return minStack.peek();
    }

    public int getMin() {
        return min;
    }
	

}
