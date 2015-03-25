
public class Solution {
	
	public static boolean isLetter(char c) {
		int ascii = (int) c;
		if (((ascii >= 65) && (ascii <= 90)) || (ascii >= 97) && (ascii <= 122) 
				|| (ascii >= 48) && (ascii <= 57))
			return true;
		return false;
	}
	
	public static boolean isSame(char c1, char c2) {
		
		return ((c1 == c2) || ((int)c1 == (int)c2 + 32) || ((int)c1 == (int)c2 - 32));
		
	}
	
    public static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
        	while ((i <= s.length() - 1) && (!isLetter(s.charAt(i)))) i++;
        	while ((j >= 0) && (!isLetter(s.charAt(j)))) j--;
        	if ((i <= s.length() - 1) && (j >= 0)){
        		if (isSame(s.charAt(i), s.charAt(j))){
        			++i; --j;
        		}
        		else return false;
        	}
        		
        }
        return true;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome("1a2"));
	}

}
