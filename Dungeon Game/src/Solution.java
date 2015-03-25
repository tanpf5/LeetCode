
public class Solution {
    public static int calculateMinimumHP(int[][] dungeon) {
    	int height = dungeon.length, width = dungeon[0].length;
        int[][] ans = new int[height][width];
        for (int i = height - 1; i >= 0; i--) 
        	for (int j = width -1; j >= 0; j--) {
        		if (i == height - 1 && j == width - 1) ans[i][j] = Math.max(1, 1 - dungeon[i][j]);
        		else {
        			if (i == height - 1) ans[i][j] = Math.max(1, ans[i][j + 1] - dungeon[i][j]);
        			else if (j == width - 1) ans[i][j]= Math.max(1, ans[i + 1][j] - dungeon[i][j]);
        			else ans[i][j] = Math.max(1, Math.min(ans[i + 1][j], ans[i][j + 1]) - dungeon[i][j]);
        		}
        	}
        return ans[0][0];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] dungeon = {{-3, 5}};
		System.out.println(calculateMinimumHP(dungeon));
	}

}
