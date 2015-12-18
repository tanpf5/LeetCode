import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Solution {
	static List<Integer> check = new ArrayList<Integer>();
    public static boolean isHappy(int n) { 	
    	if (check.contains(n)) return false;
    	else check.add(n);
    	int x = 0;
    	while (n > 0) {
    		int a = n % 10;
    		x += a * a;
    		n = n / 10;
    	}
        if (x == 1) return true;
        else return isHappy(x);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Solution.isHappy(19));
	}

}
