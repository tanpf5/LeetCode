
public class Solution {

	private static int isPrime(int n) {
		for (int i = 2; i <= Math.sqrt(n); i++) 
			if (n % i == 0) return 0;
		return 1;
	}
	public static int countPrimes(int n) {
		int x = 0;
        for (int i = 2; i <= n; i++)
        	x += isPrime(i);
        return x;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Solution.countPrimes(100));
	}

}
