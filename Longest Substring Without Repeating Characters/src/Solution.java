import java.util.HashMap;
import java.util.Map;


public class Solution {

    public static int lengthOfLongestSubstring(String s) {
        int low = 0, high = 0, ans = 0;
        Map<Character, Integer> m = new HashMap<Character, Integer>();
        for (high = 0; high < s.length(); high++) {
        	char c = s.charAt(high);
        	if (!m.containsKey(c)) {
        		m.put(c, 1);
        		if (high - low + 1 > ans) ans = high - low + 1;
        	}
        	else {
        		char c1 = s.charAt(low);
        		while (c1 != c) {
        			m.remove(c1);
        			c1 = s.charAt(++low);
        		}
        		++low;
        	}
        }
        return ans;
    }
    public static int lengthOfLongestSubstring_best(String s) {
        int ans = 0;
        Map<Character, Integer> m = new HashMap<Character, Integer>();
        for (int low = 0, high = 0; high < s.length(); high++) {
        	char c = s.charAt(high);
        	if (m.containsKey(c)) {
        		 low = Math.max(low, m.get(c) + 1);
        	}
    		m.put(c, high);
        	ans = Math.max(ans, high - low + 1);
        }
        return ans;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLongestSubstring_best("abba"));
	}

}
