//Matrix Diagonal Sum
//https://leetcode.com/problems/matrix-diagonal-sum/description/
public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println(diagonalSum(mat));
    }

    public static int diagonalSum(int[][] mat) {
        int midRow = mat.length / 2;
        int x = 0;
        int sum = 0;
        int row = 0;
        int col = 0;
        while (row < mat.length && col < mat[0].length) {
            if (midRow == row && row == col) {
                x = mat[row][col];
                row++;
                col++;
                continue;
            } else {
                sum = sum + mat[row][col];
            }
            row++;
            col++;
        }
        int a = 0;
        int b = mat[a].length - 1;
        while (a < mat.length && b >= 0) {
            if (midRow == a && a == b) {
                x = mat[a][b];
                a++;
                b--;
                continue;
            } else {
                sum = sum + mat[a][b];
            }
            a++;
            b--;
        }
        sum = sum + x;
        return sum;
    }
}