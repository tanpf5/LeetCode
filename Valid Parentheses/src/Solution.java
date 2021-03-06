import java.util.HashMap;
import java.util.Map;
import java.util.Stack;


public class Solution {

    public static boolean isValid(String s) {
        Map map = new HashMap();
        Stack stack = new Stack();
        map.put('(', 1); map.put(1, ')');
        map.put('[', 2); map.put(2, ']');
        map.put('{', 3); map.put(3, '}');
        for (int i = 0; i < s.length(); i++) {
        	char c = s.charAt(i);
        	if (map.get(c) != null) {
        		stack.push(map.get(c));
        	} else {
        		if (stack.empty() || 
        				(Character) map.get(stack.pop()) != c) return false;
        	}
        }
        if (stack.empty()) return true;
        else return false;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isValid("]"));
	}

}
