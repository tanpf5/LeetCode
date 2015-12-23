import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public class Interview {

	public static void main(String[] args) {
		// Switch
		if (true) {
			int a = 0;
			switch (a) {
	        case 1: ;
	        		break;
	        default: ;
	        		 break;
			}
		}
			
		// Array
		//return new int[] {0, 0};
		if (true) {
			int[] nums = new int[5];
			int[] nums2 = {1, 2, 3, 4, 5}, a = null;
			Interval[] intervals = new Interval[5];
			int n = nums.length, fromIndex = 0, toIndex = 0, key = 0;
			Arrays.sort(nums);
			Arrays.binarySearch(a, fromIndex, toIndex, key);
			Arrays.sort(intervals, new Comparator<Interval>() {
				public int compare(Interval a, Interval b) {
					// TODO Auto-generated method stub
					return a.start - b.start;
				}	
			});
		}
		
		// List
		if (true) {
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
			al.get(index);
			ans.size();
			Collections.sort(al, new Comparator<Integer>() {
		        public int compare(Integer a, Integer b) {
		            // TODO Auto-generated method stub
		            return a - b;
		        }
		    });
		}
		
		// Hash Map/Table
		if (true) {
			Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
			Map<Integer, Integer> ht = new Hashtable<Integer, Integer>();
			int key = 0, value = 0;
			ht.put(key, value);
			ht.get(key);
			ht.containsKey(key);
			ht.containsValue(value);
		}
		
		// String && String Builder
		if (true) {
			int start = 0, end = 0;
			String s = null;
			s.length();
			StringBuilder sb = new StringBuilder();
			sb.append(s);
			sb.deleteCharAt(sb.length() - 1);
			sb.delete(start, end); // [start, end)
			sb.reverse();
			s = sb.toString();
		}

		// 
		// char to int
		int x = Character.getNumericValue('1');
		// int to String
		Integer.toString(x);
		
		// Integer
		int a = Integer.MAX_VALUE;
	}

}
