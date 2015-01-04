
public class Solution {

    public static int[] plusOne(int[] digits) {
    	int count = 1;
    	int i = digits.length - 1;
    	while (count == 1 && i >= 0) {
    		count = (digits[i] + 1) / 10;
    		digits[i] = (digits[i] + 1) % 10;
    		i--;
    	}
    	if (i == -1 && count == 1) {
    		int[] ans = new int[digits.length + 1];
    		for (int j = 0; j <= digits.length - 1; j++)
    			ans[j + 1] = digits[j];
    		ans[0] = 1;
    		return ans;
    	}
    	else return digits;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number = new int[]{9};
		System.out.println(plusOne(number));
	}

}
