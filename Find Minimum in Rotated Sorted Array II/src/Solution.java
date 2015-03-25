
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = {4, 5, 6, 7, 7, 1, 1, 2};
		System.out.println(findMin(num));
	}

    public static int findMin(int[] num) {
        if (num.length == 1) return num[0];
        if (num.length == 2) return Math.min(num[0], num[1]);
        return binarySearch(num, 0, num.length - 1);
    }

	private static int binarySearch(int[] num, int low, int high) {
		// TODO Auto-generated method stub
		if (high == low) return num[low];
		if (high == low + 1) return Math.min(num[low], num[high]);
 		int mid = (low + high) / 2;
 		// < < / = = / < = / = <
		if (num[mid - 1] <= num[mid] && num[mid] <= num[mid + 1]) 
			return Math.min(binarySearch(num, low, mid - 1), binarySearch(num, mid + 1, high));
		// < > / = >
		if (num[mid - 1] <= num[mid] && num[mid] > num[mid + 1]) 
			return num[mid + 1];
		// > < / > = / 
		if (num[mid - 1] > num[mid] && num[mid] <= num[mid + 1]) return num[mid];
		// > >
		return 0;
	}
}
