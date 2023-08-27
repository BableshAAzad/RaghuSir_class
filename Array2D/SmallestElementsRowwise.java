package Array2D;

import java.util.Scanner;

public class SmallestElementsRowwise {
    public static void main(String[] args) {
        int[][] x = readMat();
        System.out.println("User entered matrix : ");
        display(x);
        int[] smallR = rowwiseSmall(x);
        for (int i = 0; i < smallR.length; i++) {
            System.out.println(i + 1 + " Row smallest element is : " + smallR[i]);
        }
    }

    static int[] rowwiseSmall(int[][] mat) {
        int[] bg = new int[mat.length];
        for (int i = 0; i < mat.length; i++) {
            int small = mat[i][0];
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] < small)
                    small = mat[i][j];
            }
            bg[i] = small;
        }
        return bg;
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
