package Array2D;

import java.util.Scanner;

public class SmallestElementsColumnwise {
    public static void main(String[] args) {
        int[][] x = readMat();
        System.out.println("User entered matrix : ");
        display(x);
        int[] smallC = colwiseSmall(x);
        for (int i = 0; i < smallC.length; i++) {
            System.out.println(i + 1 + " column smallest element is : " + smallC[i]);
        }
    }

    static int[] colwiseSmall(int[][] mat) {
        int[] sml = new int[mat[0].length];
        for (int i = 0; i < mat[0].length; i++) {
            int small = mat[0][i];
            for (int j = 0; j < mat.length; j++) {
                if (mat[j][i] < small)
                    small = mat[j][i];
            }
            sml[i] = small;
        }
        return sml;
    }

    static int[][] readMat() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the order of a matrix (row*column) : ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] mat = new int[row][col];
        System.out.println("Enter " + row * col + " elements rowwise : ");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        return mat;
    }

    static void display(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
