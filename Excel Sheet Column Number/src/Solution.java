
public class Solution {
    public static String convertToTitle(int n) {
        String s = "";
        while (n > 0) {
        	int remainder = n % 26;
        	if (remainder == 0) remainder = 26;
        	char c = (char)(remainder + (int)('A') - 1);
        	s += c;
        	n = (n - 1) / 26;
        }
        String ans = "";
        for (int i = s.length() -1; i >= 0; i--) {
        	ans += s.charAt(i);
        }
        return ans;
    }
	
    public static int titleToNumber(String s) {
    	int ans = 0;
        for (int i = 0; i < s.length(); i++) {
        	char c = s.charAt(i);
        	ans = ans * 26 + (int)c - (int)'A' + 1;
        }
        return ans;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(titleToNumber("AB"));
		System.out.println(convertToTitle(titleToNumber("Z")));
	}

}
