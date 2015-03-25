import java.util.Comparator;


public class Comp implements Comparator {

	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static int compare(String s1, String s2) {
		// TODO Auto-generated method stub
		if (Integer.parseInt(s1 + s2) > Integer.parseInt(s2 + s1)) {
			return 1;
		} else if (Integer.parseInt(s1 + s2) == Integer.parseInt(s2 + s1)) {
			return 0;
		} else {
			return -1;
		}
	}
}
