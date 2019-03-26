import java.util.ArrayList;
import java.util.List;

public class Solution_883_Projection_Area_of_3D_Shapes {
	 
	public int projectionArea(int[][] grid) {
		
		int projectionCount = getTopCount(grid) + getFrontCount(grid) + getSideCount(grid);
		
		return projectionCount;
    }
	
	public int getTopCount(int[][] grid) {
		
		int topCount = 0;
		for(int i=0; i<grid.length; i++) {
			for(int j=0; j<grid[i].length; j++) {
				if(grid[i][j]>0) {
				topCount += 1;
				}
			}
		}
		return topCount;
	}
	
	public int getFrontCount(int[][] grid) {
		
		int frontCount = 0;
		int frontWidth = grid[0].length;
		int[] highestCubes = new int[frontWidth];
		
		for(int i=0; i<frontWidth; i++) {
			int maxHeight = 0;
			for(int j=0; j<grid.length; j++) {
				if (grid[j][i]>maxHeight) {
					maxHeight = grid[j][i];
				}
			}
			highestCubes[i] = maxHeight;
		}
		
		for(int i=0; i<highestCubes.length; i++) {
			frontCount += highestCubes[i];
		}
		
		return frontCount;
	}
	
	public int getSideCount(int[][] grid) {
		
		int sideCount = 0;
		int sideWidth = grid.length;
		int[] highestCubes = new int[sideWidth];
		
		for(int i=0; i<sideWidth; i++) {
			int maxHeight = 0;
			for(int j=0; j<grid[i].length; j++) {
				if(grid[i][j]>maxHeight) {
					maxHeight = grid[i][j];
				}
			}
			highestCubes[i] = maxHeight;
		}
		
		for(int i=0; i<highestCubes.length; i++) {
			sideCount += highestCubes[i];
		}
		
		return sideCount;
	}

	public static void main(String[] args) {
		Solution_883_Projection_Area_of_3D_Shapes obj = new Solution_883_Projection_Area_of_3D_Shapes();
		
		int[][] grid1 = {{1, 2}, {3, 4}};
		int[][] grid2 = {{1}};
		int[][] grid3 = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
		int[][] grid4 = {{2, 2, 2}, {2, 1, 2}, {2, 2, 2}};
		
		System.out.println(obj.getTopCount(grid4));
		System.out.println(obj.getFrontCount(grid4));
		System.out.println(obj.getSideCount(grid4));
		System.out.println(obj.projectionArea(grid4));
	}
	 
}
