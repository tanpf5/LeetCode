import java.util.Stack;

public class MinStack {
	private static int min;
	private static Stack<Integer> minStack = new Stack<Integer>();
    public static void push(int x) {
        minStack.push(x);
        min = Math.min(min, x);
    }

    public static void pop() {
        minStack.pop();
    }

    public static int top() {
        return minStack.peek();
    }

    public static int getMin() {
        return min;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		push(2);
		push(-2);
		push(0);
		push(8);
		pop();
		System.out.println(top());
		System.out.println(getMin());
	}

}
