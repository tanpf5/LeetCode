
public class Solution {

    public static int reverse(int x) {
    	String s = Integer.toString(x);
    	String reverse = new StringBuffer(s).reverse().toString();
    	if (x < 0) reverse = "-" + reverse.substring(0, reverse.length() - 1);
		long result = Long.parseLong(reverse);
		if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE)
			return 0;
		return (int) result;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse(-123));

	}

}
