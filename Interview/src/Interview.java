import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;


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
			
		// Math
		if (true) {
			double a = 0, b = 1;
			Math.max(a, b);
			Math.sqrt(100); // return double
			Math.round(10.2); // return long
			Math.pow(2, 3); // return double
			Math.log(10.2);
			Math.random(); // return double
			Random r = new Random();
			int x= r.nextInt(10);
			Math.floor(10.2); // return double, 10.0
			Math.ceil(10.2); // return double, 11.0
		}
		
		// Array
		//return new int[] {0, 0};
		if (true) {
			int[] nums = new int[5];
			int[] nums2 = {1, 2, 3, 4, 5}, a = null;
			int[] original = null;
			int newLength = 0;
			int[] nums3 = Arrays.copyOf(original, newLength);
			List<Integer>[] nums4 = new ArrayList[5];
			Interval[] intervals = new Interval[5];
			boolean[][] b = new boolean[1][3];
			int n = nums.length, fromIndex = 0, toIndex = 0, key = 0;
			Arrays.sort(nums);
			Arrays.binarySearch(nums, fromIndex, toIndex, key);
			Arrays.sort(intervals, new Comparator<Interval>() {
				public int compare(Interval a, Interval b) {
					// TODO Auto-generated method stub
					return a.start - b.start;
				}	
			});
			Arrays.asList(nums);
			Arrays.copyOf(original, newLength);
		}
		
		// List
		if (true) {
			List<Integer> al = new ArrayList<Integer>();
			List<Integer> al2 = new ArrayList<Integer>(2); // capacity not initial value
			List<Integer> al3 = Arrays.asList(1, 2, 3);
			List<Integer> al4 = new ArrayList<>(al3);
			LinkedList<Integer> ll = new LinkedList<Integer>();
			List<List<Integer>> ans = new ArrayList<List<Integer>>();
			ans.add(Arrays.asList(1, 2, 3));
			for (int i : al) {
				
			}
			int e = 0, index = 0, o = 0, element = 0;
			al.set(index, element);
			al.add(e);
			al.add(0, e);
			al.addAll(ll);
			ll.addFirst(e);
			al.remove(index);
			al.remove(new Integer(1));
			al.get(index);
			al.set(index, e);
			al.isEmpty();
			ans.size();
			Integer[] aa = (Integer[]) al.toArray();
			Collections.sort(al, new Comparator<Integer>() {
		        public int compare(Integer a, Integer b) {
		            // TODO Auto-generated method stub
		            return a - b;
		        }
		    });
			Iterator<Integer> iterator = al.iterator();
			while (iterator.hasNext()) {
				int a = iterator.next();
			}
			// stack
			Stack<Integer> s = new Stack<Integer>();
			Deque<Integer> stack = new ArrayDeque<Integer>(); // better one
			int item = 0;
			// all these s functions stack also has, expect empty
			s.empty();
			s.push(item);
			s.pop();
			s.peek();
			stack.addFirst(e);
			stack.removeFirst();
			stack.size();
			stack.isEmpty();
			
			// queue
			Queue<Integer> q = new LinkedList<Integer>();
			Queue<Character> q2 = new ArrayDeque<Character>();
			q.add(e);
			q.poll();
			q.peek();
			q.isEmpty();
			q.size();
			q.offer(e);
		}
		
		// Hash Map/Table and Tree map
		if (true) {
			Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
			Map<Integer, Integer> ht = new Hashtable<Integer, Integer>();
			Map<Integer, Integer> tm = new TreeMap<Integer, Integer>();
			int key = 0, value = 0;
			ht.put(key, value);
			ht.get(key);
			ht.containsKey(key);
			ht.containsValue(value);
			hm.remove(key);
			for (int i : tm.keySet()) {
				tm.get(i);
			}
			for (Map.Entry<Integer, Integer> entry : tm.entrySet()) {
				int key1 = entry.getKey();
				int value1 = entry.getValue();
			}
			hm.values(); // all values
			ht.size();
			ht.isEmpty();
		}
		
		// Set
		if (true) {
			Set<Integer> s = new HashSet<Integer>();
			int e = 0;
			s.add(e);
			s.contains(e);
			s.size();
			s.remove(new Integer(e));
			s.remove(1);
			s.toArray();
			int[] result = new int[s.size()];
		}
		
		// Heap/PriorityQueue
		if (true) {
			PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
			PriorityQueue<Integer> pq2 = new PriorityQueue<Integer>(Collections.reverseOrder());
			PriorityQueue<int[]> q = new PriorityQueue<int[]>(new Comparator<int[]>() {
		        public int compare(int[] a, int[] b) {
		            // TODO Auto-generated method stub
		            return a[0] == b[0] ? a[1] - b[1] : a[0] - b[0];
		        }
		    });
			int e = 0;
			// add = offer
			pq.add(e);
			pq.offer(e);
			pq.poll();
			pq.size();
			pq.remove(new Object());
			pq.isEmpty();
			pq.addAll(pq2);
		}
		
		// String && String Builder
		if (true) {
			int start = 0, end = 0, beginIndex = 0, endIndex = 0, i = 0, fromIndex = 0;;
			String s = null, str = null;
			s.length();
			// use substring to instead remove operation
			// remove i
			s = s.substring(0, i) + s.substring(i + 1, s.length());
			s.lastIndexOf('a');
			s.indexOf('a');
			s.substring(beginIndex);
			s.substring(beginIndex, endIndex);
			s.equals(s);
			s.indexOf(str, fromIndex);
			s.trim();
			s.isEmpty();
			s.contains("c");
			s.toLowerCase();
			s.split(":");
			s.compareTo(s);
			char[] cs = s.toCharArray();
			s = cs.toString();
			char oldChar = 'a', newChar = 'b';
			s.replace(oldChar, newChar);
			// reverse string
			StringBuilder sb2 = new StringBuilder(s);
			sb2.reverse();
			s = sb2.toString();
			// sort a string by its contents
			if (s != null) {
				char[] chars = s.toCharArray();
				Arrays.sort(chars);
				//chars.toString();
				String sorted = new String(chars);
			}
			StringBuilder sb = new StringBuilder();
			char c = '0';
			int offset = 0;
			sb.charAt(0);
			sb.append(s);
			sb.insert(offset, c);
			sb.insert(offset, str);
			sb.deleteCharAt(sb.length() - 1);
			sb.delete(start, end); // [start, end)
			sb.reverse();
			// backtracking
			int n = sb.length();
			// back track
			sb.setLength(n);
			
			s = sb.toString();
			
			// char[]
			char[] chars = s.toCharArray();
			String ss = new String(chars);
			String.valueOf(chars);
		}

		// 
		if (true) {
			// char to int
			int x = Character.getNumericValue('1');
			char c = '1';
			x = c - '0';
			// int to char
			c = 1 + '0';
			// int to String
			String s = Integer.toString(x);
			s = String.valueOf(x);
			// String to int
			int y = Integer.parseInt(s);
			// Array to List
			int[] a = { 1, 2, 3 };
			Arrays.asList(a);
			// List to Array
			List<String> l = new ArrayList<String>();
			String[] ss = new String[l.size()];
			ss = l.toArray(ss);
			// Set to List
			Set set = new HashSet();
			// first method
			List list = new ArrayList(set);
			// second method
			list.addAll(set);
		}
		
		// Integer
		int a = Integer.MAX_VALUE;
		
		// Union Find
		int n = 0;
		int[][] edges = null;
		unionFind(n, edges);
	}
	static Map<Integer, Node> forest;
	private static void unionFind(int n, int[][] edges) {
		forest = new HashMap<>();
		for (int i = 0; i < n; i++) {
			forest.put(i, makeSet(i));
		}
		// do something
	}
	public static Node makeSet(int node) {
		Node n = new Node(node);
		n.parent = n;
		return n;
	}
	public static Node find(int node) {
		Node n = forest.get(node);
		if (n.parent.val == node)
			return n;
		return find(n.parent.val);
	}
	public static void union(int node1, int node2) {
		Node n1 = forest.get(node1);
		Node n2 = forest.get(node2);
		n1.parent = n2;
	}
}
