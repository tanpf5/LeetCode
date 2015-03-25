import java.util.HashSet;
import java.util.Set;


public class Solution {
    public static boolean wordBreak(String s, Set<String> dict) {
        if (s == null || s.length() == 0) return false;
        if (dict.isEmpty()) return false;
        int n = s.length();
        boolean[] b = new boolean[n];
        for (int i = 0; i < n; i++) {
        	for (String word : dict) {
        		if (i - word.length() + 1 < 0) continue;
        		if (s.indexOf(word, i - word.length() + 1) == i - word.length() + 1)
        			b[i] = i - word.length() >= 0 ? (b[i - word.length()] || b[i]) : true;
        	}
        }
        return b[n - 1];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> dict = new HashSet<String>();
		dict.add("a");
		//dict.add("code");
		System.out.println(Solution.wordBreak("a", dict));
	}

}
