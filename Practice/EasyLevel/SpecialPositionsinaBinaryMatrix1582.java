package Practice.EasyLevel;

public class SpecialPositionsinaBinaryMatrix1582 {
    public static int numSpecial(int[][] mat) {
        int res = 0;
        int[] row = new int[mat.length];
        int[] col = new int[mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                row[i] += mat[i][j];
                col[j] += mat[i][j];
            }
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1 && row[i] == 1 && col[j] == 1) {
                    res++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        // int[][] mat = { { 1, 0, 0 }, { 0, 0, 1 }, { 1, 0, 0 } }; // 1
        int[][] mat = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } }; // 1
        int res = numSpecial(mat);
        System.out.println(res);
    }
}
/**
 * Given an m x n binary matrix mat, return the number of special positions in
 * mat.
 * 
 * A position (i, j) is called special if mat[i][j] == 1 and all other elements
 * in row i and column j are 0 (rows and columns are 0-indexed).
 * 
 * Example 1:
 * 
 * 
 * Input: mat = [[1,0,0],[0,0,1],[1,0,0]]
 * Output: 1
 * Explanation: (1, 2) is a special position because mat[1][2] == 1 and all
 * other elements in row 1 and column 2 are 0.
 * Example 2:
 * 
 * 
 * Input: mat = [[1,0,0],[0,1,0],[0,0,1]]
 * Output: 3
 * Explanation: (0, 0), (1, 1) and (2, 2) are special positions.
 * 
 */