
public class Solution {
    public static int numDecodings(String s) {
    	if (s == null || s.length() == 0) 
    		return 0;
        int n = s.length();
        int[] a = new int[n];
        a[0] = s.charAt(0) != '0' ? 1 : 0;
        for (int i = 1; i < n; i++) {
        	a[i] = s.charAt(i) != '0' ? a[i - 1] : 0;
        	a[i] += isTwoDigit(s.charAt(i - 1), s.charAt(i)) ? (i > 1 ? a[i - 2] : 1) : 0;
        }
        return a[n - 1];
    }
	private static boolean isTwoDigit(char c1, char c2) {
		// TODO Auto-generated method stub
		int x = ((int)c1 - (int)'0') * 10 + ((int)c2 - (int)'0');
		if (x >= 10 && x <= 26) return true;
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Solution.numDecodings("1"));
	}

}
