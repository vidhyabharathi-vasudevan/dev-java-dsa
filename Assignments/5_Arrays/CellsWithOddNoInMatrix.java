//Cells with Odd Values in a Matrix
//https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/
public class CellsWithOddNoInMatrix {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] grid = new int[m][n];
        int Ri = 0;
        int Ci = 0;
        for(int row=0;row<indices.length;row++){
            Ri = indices[row][0];
            Ci = indices[row][1];
            for(int i=0;i<grid[Ri].length;i++){
                grid[Ri][i] = grid[Ri][i]+1;
            }
            for(int i=0;i<grid.length;i++){
                grid[i][Ci] = grid[i][Ci]+1;
            }
        }
        int oddCount = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]%2!=0){
                    oddCount++;
                }
            }
        }
        return oddCount;
    }
}
