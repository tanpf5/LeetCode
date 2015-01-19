
public class Solution {
    public static int titleToNumber(String s) {
    	int ans = 0;
        while (s.length() > 1) {
        	char c = s.charAt(0);
        	ans = ans * 26 + (int)c - (int)'A' + 1;
        	s = s.substring(1);
        }
        return ans * 26 + (int)s.charAt(0) - (int)'A' + 1;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(titleToNumber("AB"));
	}

}