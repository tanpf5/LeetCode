import java.util.Deque;
import java.util.List;
import java.util.Stack;


public class Solution {
    public static int longestValidParentheses(String s) {
    	if (s == null || s.length() < 2) return 0;
    	int n = s.length();
        int max = 0;
        Stack<Integer> stack = new Stack<Integer>();
        int[] a = new int[n];
        for (int i = 0; i < s.length(); i++) {
        	if (s.charAt(i) == '(') {
        		stack.push(i);
        		a[i] = 0;
        	}
        	if (s.charAt(i) == ')') {
        		if (stack.isEmpty()) {
        			a[i] = 0;
        			continue;
        		}
        		int x = stack.pop();
        		a[i] = (i - (x - 1)) + (x - 1 >= 0? a[x - 1]: 0);
        		max = Math.max(a[i], max);
        	}
        }
        return max;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "()(()(())())";
		System.out.println(Solution.longestValidParentheses(s));
	}

}
