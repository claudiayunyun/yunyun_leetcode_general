package LeetCode.General;

public class NumberOfIslands {
	
	public int numIslands(char[][] grid) {
		/*
		 * DFS: time and space O(M*N)
		 * !!!! visited node set to '0' 
		 */
		if(grid == null || grid.length == 0) return 0;
		
		int num = 0;
		for(int row = 0; row < grid.length; row++) {
			for(int column = 0; column < grid[0].length; column++) {
				if(grid[row][column] == '1') {
					num++;
					dfs(grid, row, column);
				}
			}
		}
		
        return num;
    }
	
	private void dfs(char[][] grid, int row, int column) {
		if(row < 0 || column < 0 || row >= grid.length || column >= grid[0].length || grid[row][column] =='0') return;
		
		grid[row][column] = '0';
		dfs(grid, row - 1, column);
		dfs(grid, row + 1, column);
		dfs(grid, row, column - 1);
		dfs(grid, row, column + 1);
	}

}
