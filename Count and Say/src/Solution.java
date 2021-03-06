
public class Solution {

    public static String countAndSay(int n) {
    	if (n == 1) return "1";
        String prev = countAndSay(n - 1);
        StringBuilder ans = new StringBuilder();
        int count = 1;
        char ch = prev.charAt(0);
        for (int i = 1; i < prev.length(); i++) {
        	if (prev.charAt(i) == ch)
        		++count; 
        	else {
        		ans.append(Integer.toString(count));
        		ans.append(ch);
        		count = 1;
        		ch = prev.charAt(i);
        	}
        }
		ans.append(Integer.toString(count));
		ans.append(prev.charAt(prev.length() - 1));
        return ans.toString();
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(countAndSay(25));
	}

}
