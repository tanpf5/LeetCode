import java.util.Arrays;


public class Solution {
	
    public static int threeSumClosest(int[] num, int target) {
        Arrays.sort(num);
        int ans = num[0] + num[1] + num[2] - target;
        int n = num.length;
        for (int i = 0; i < n - 2; i++) {
        	int sum = target - num[i];
        	int low = i + 1, high = n - 1;
        	while (low < high) {
        		if (num[low] + num[high] == sum) return target;
        		if (num[low] + num[high] < sum) {
        			if (Math.abs(num[low] + num[high] - sum) < Math.abs(ans))
        				ans = num[low] + num[high] - sum;
        			low++;
        		} else {
        			if (Math.abs(num[low] + num[high] - sum) < Math.abs(ans))
        				ans = num[low] + num[high] - sum;
        			high--;
        		}
        	}
        }
        return ans + target;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {-1, 2, 1, -4, 5, 7};
		System.out.println(Solution.threeSumClosest(a, 12));
	}

}
