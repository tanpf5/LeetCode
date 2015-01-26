import java.util.HashMap;
import java.util.Map;


public class Solution {
    public static int majorityElement(int[] num) {
    	Map a = new HashMap();
        for (int i = 0; i < num.length; i++) {
        	if (a.get(num[i]) == null) {
        		a.put(num[i], 1);
        	} else {
        		int times = (Integer) a.get(num[i]) + 1;
        		if (times > Math.ceil(num.length / 2)) return num[i];
        		else {
        			a.remove(num[i]);
        			a.put(num[i], times);
        		}
        	}
        }
        return 0;
    }
    
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 3, 3, 2, 2, 2, 2};
		System.out.println(majorityElement(a));

	}

}
