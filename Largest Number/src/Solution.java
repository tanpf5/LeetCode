import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;


public class Solution {
		
    public static String largestNumber(int[] num) {
    	String[] s = new String[num.length];
    	for (int i = 0; i < num.length; i++) {
    		s[i] = Integer.toString(num[i]);
    	}
    	Arrays.sort(s, new Comparator<String>(){

			public int compare(String o1, String o2) {
				return -(o1 + o2).compareTo(o2 + o1);
			}   		
    	});
    	StringBuilder ans = new StringBuilder();
    	for (String n:s) {
    		ans.append(n);
    	}
    	return ans.charAt(0) == '0' ? "0" : ans.toString();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {30, 30, 34, 5, 9};
		System.out.println(largestNumber(num));
	}

}
