
public class Solution {

    public static void merge(int A[], int m, int B[], int n) {
    	int i = m - 1, j = n - 1, k = m + n - 1;
    	while (i >= 0 && j >= 0) {
    		if (A[i] > B[j]) {
    			A[k--] = A[i--]; 
    		} else {
    			A[k--] = B[j--];
    		}
    	}
    	if (j >= 0) 
    		for (int p = 0; p <= j; p++)
    			A[p] = B[p];
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {1};
		int B[] = {1};
		merge(A, 1, B, 1);
	}

}
