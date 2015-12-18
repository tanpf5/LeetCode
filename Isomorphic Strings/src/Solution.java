import java.util.HashMap;
import java.util.Map;


public class Solution {

    public static boolean isIsomorphic(String s, String t) {
        if (s == null || s.length() <= 1) return true;
        Map<Character, Integer> ms = new HashMap<Character, Integer>();
        Map<Character, Integer> mt = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
        	char a = s.charAt(i);
        	char b = t.charAt(i);
        	if (ms.containsKey(a)) 
        		if (ms.get(a) != mt.get(b)) return false;
        		else;
        	else 
        		if (mt.containsKey(b)) return false;
        		else {
        			ms.put(a, i);
        			mt.put(b, i);
        		}
        }
        return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "p";
		String t = "t";
		System.out.println(Solution.isIsomorphic(s, t));
	}

}
