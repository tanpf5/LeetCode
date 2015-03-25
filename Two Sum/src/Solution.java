import java.util.Hashtable;


public class Solution {
	
    public static int[] twoSum(int[] numbers, int target) {
    	Hashtable<Integer, Integer> numbers_hash
    		= new Hashtable<Integer, Integer>();
    	for (int i = 0; i <= numbers.length - 1; i++)
    		numbers_hash.put(numbers[i], i);
    	for (int i = 0; i <= numbers.length - 1; i++) {
    		if (numbers_hash.get(target - numbers[i]) != null) {
    			int index1 = Math.min(i, numbers_hash.get(target - numbers[i])) + 1;
    			int index2 = Math.max(i, numbers_hash.get(target - numbers[i])) + 1;
    			if (index1 != index2) {
    				return new int[] {index1, index2};
    			}
    		}
    	}
		return numbers;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[] = {3,2,4};
		twoSum(numbers, 6);
	}

}
