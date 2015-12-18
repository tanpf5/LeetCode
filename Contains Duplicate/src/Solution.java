import java.util.HashMap;
import java.util.Map;


public class Solution {
    public boolean containsDuplicate(int[] nums) {
    	if (nums == null || nums.length <= 1)
    		return false;
    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    	for (int i = 0; i < nums.length; i++) {
    		if (map.containsKey(nums[i]))
    			return true;
    		else map.put(nums[i], i);
    	}
        return false;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(containsDuplicate([1, 2, 3, 4, 5, 3]));
	}

}
