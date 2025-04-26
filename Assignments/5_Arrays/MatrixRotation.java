//1886. Determine Whether Matrix Can Be Obtained By Rotation
//https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/description/
public class MatrixRotation {
    public static void main(String[] args){
        int[][] mat = {
            {0, 0, 0},
            {0, 1, 0},
            {1, 1, 1}
        };
        int[][] target = {
            {1, 1, 1},
            {0, 1, 0},
            {0, 0, 0}
        };
        boolean result = findRotation(mat, target);
        System.out.println("Can mat be rotated to match target? " + result);
    }
    public static boolean findRotation(int[][] mat, int[][] target) {
        //90 degree
        if(isEqual(mat,target)){
            return true;
        }
        int n = mat.length;
        for(int i=0;i<4;i++){
            int[][] rot = new int[mat.length][mat[0].length];
            for(int a=0;a<n;a++){
                for(int b=0;b<n;b++){
                    rot[a][b] = mat[b][n-1-a];
                }
            }
            if(isEqual(rot,target)){
                return true;
            }
            mat = rot;
        }
        return false;
    }
    public static boolean isEqual(int[][] a,int[][] b){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(a[i][j]!=b[i][j]){
                    return false;
                }
            }
        }
        return true;
    } 
}
