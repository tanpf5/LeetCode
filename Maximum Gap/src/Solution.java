import java.util.ArrayList;
import java.util.List;


public class Solution {
    public static int maximumGap(int[] num) {
    	if (num.length < 2) return 0;
        List<Integer>[] a = new ArrayList[10];
        for (int i = 0; i < 10; i++)
        	a[i] = new ArrayList<Integer>();
        int max = num[0];
        for (int i = 1; i < num.length; i++)
        	max = Math.max(max, num[i]);
        int n = 0;
        while (max > 0) {
        	++n;
        	max /= 10;
        }
        int d = 1;
        for (int i = 1; i <= n; i++) {
        	for (int j = 0; j < num.length; j++) {
        		int k = (num[j] / d) % 10;
        		a[k].add(num[j]);
        	}
        	int t = 0;
        	for (int j = 0; j <= 9; j++) {
        		for (int k : a[j]) 
        			num[t++] = k;
        		a[j].clear();
        	}
        	d *= 10;
        }
        int ans = 0;
        for (int i = 0; i < num.length - 1; i++) 
        	ans = Math.max(num[i + 1] - num[i], ans);
        return ans;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {12, 234, 34, 54, 64, 86, 98, 456, 732};
		System.out.println(maximumGap(num));
	}

}
