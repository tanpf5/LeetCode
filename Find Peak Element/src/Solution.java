
public class Solution {

    public static int findPeakElement(int[] num) {
        int low = 0, mid, high = num.length - 1;
        if (high == 0) return low;
        while (low < high) {
        	mid = (low + high) / 2;
        	if (num[mid] < num[mid + 1]) 
        		low = mid + 1;
        	else high = mid;
        }
        return low;
    }
    
    private static int recur(int low, int high, int[] num){
    	if (low == high) return low;
    	int mid = (low + high) / 2;
    	if (num[mid] < num[mid + 1]) return recur(mid + 1, high, num);
    	else return recur(low, mid, num);
    }
    
    public static int findPeakElement1(int[] num) {
        
        return recur(0, num.length - 1, num);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1, 2, 3, 1};
		System.out.println(findPeakElement1(a));
	}

}
