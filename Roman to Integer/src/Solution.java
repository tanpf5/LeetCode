
public class Solution {
	public static int atoi(char c) {
		switch (c) {
		case 'I' : return 1;
		case 'V' : return 5;
		case 'X' : return 10;
		case 'L' : return 50;
		case 'C' : return 100;
		case 'D' : return 500;
		case 'M' : return 1000;
		}
		return 0;
	}
	
    public static int romanToInt(String s) {
    	int prev = atoi(s.charAt(0)), ans = 0, inter = prev;
        for (int i = 1; i < s.length(); i++) {
        	int now = atoi(s.charAt(i));
        	if (now == prev) {
        		inter += prev;
        		continue;
        	}
        	if (now > prev) {
        		ans -= inter;
        		prev = now;
        		inter = now;
        		continue;
        	}
        	if (now < prev) {
        		ans += inter;
        		prev = now;
        		inter = now;
        		continue;
        	}
        }
        return ans + inter;
    }
    
	public static void main(String[] args) {
		System.out.println(romanToInt("XCIX"));
		// TODO Auto-generated method stub

	}

}
