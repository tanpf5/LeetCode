import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public class Interview {

	public static void main(String[] args) {
		// Array
		//return new int[] {0, 0};
		int[] nums = new int[5];
		int[] nums2 = {1, 2, 3, 4, 5};
		int n = nums.length;
		Arrays.sort(nums);
		
		// List
		List<Integer> al = new ArrayList<Integer>();
		LinkedList<Integer> ll = new LinkedList<Integer>();
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		ans.add(Arrays.asList(1, 2, 3));
		int e = 0, index = 0, o = 0;
		al.add(e);
		al.add(0, e);
		ll.addFirst(e);
		al.remove(index);
		al.remove(o);
		ans.size();
		
		// Hash Map/Table
		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		Map<Integer, Integer> ht = new Hashtable<Integer, Integer>();
		int key = 0, value = 0;
		ht.put(key, value);
		ht.get(key);
		ht.containsKey(key);
		ht.containsValue(value);
	}

}
