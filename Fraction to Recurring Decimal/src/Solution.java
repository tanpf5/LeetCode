import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Solution {
    public static String fractionToDecimal(int numerator, int denominator) {
    	String ans = "";
    	/*if (numerator * denominator < 0) ans += "-";
        numerator = Math.abs(numerator); 
        denominator = Math.abs(denominator);*/
        
        // remainder, quotient
        List<Integer> remainder = new ArrayList<Integer>();
        List<Integer> quotient = new ArrayList<Integer>();
        int quo = numerator / denominator;
        int rem = numerator % denominator;
        if (rem == 0) return ans += Integer.toString(quo);
        ans = ans + Integer.toString(quo) + '.';
        while (true) {
        	quo = rem * 10 / denominator;
        	if (remainder.contains(rem)) break;
        	remainder.add(rem);
        	quotient.add(quo);
        	rem = rem * 10 % denominator;
        	if (rem == 0) break;
        }
        Iterator<Integer> iter1 = quotient.iterator();
        Iterator<Integer> iter2 = remainder.iterator();
        boolean start = false;
        while (iter1.hasNext()) {
        	if (rem == iter2.next()) {
        		start = true;
        		ans += '(';
        		ans += iter1.next();
        	} else if (start) {
        		ans += iter1.next();
        	} else ans += iter1.next();
        }
        if (rem != 0) ans += ')';
        return ans;
    }
    
    public static void main(String[] args) {
    	System.out.println(fractionToDecimal(-1, -2147483648));
    }
}
