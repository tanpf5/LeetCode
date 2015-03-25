
public class Solution {
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[] a = new int[n];
        if (obstacleGrid[0][0] == 1) 
        	return 0;
        else
        	a[0] = 1;
        for (int j = 1; j < n; j++)
        	if (obstacleGrid[0][j] == 0)
        		a[j] = a[j - 1];
        	else a[j] = 0;
        for (int i = 1; i < m; i++)
        	for (int j = 0; j < n; j++) 
        		if (obstacleGrid[i][j] == 0) {
        			if (j != 0)
        				a[j] += a[j - 1]; 
        		}
        		else 
        			a[j] = 0;
        return a[n - 1];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {
				{0, 0, 0},
				{0, 1, 0}, 
				{0, 0, 0}
			};
		System.out.println(Solution.uniquePathsWithObstacles(a));
	}

}
