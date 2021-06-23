package ArrayString;

import java.util.ArrayList;

public class ZeroMatrix {
    public static void main(String[] args) {

        int[][] matrix = { { 1, 2, 3, 4 }, { 5, 0, 7, 8 }, { 9, 10, 0, 12 }, { 13, 14, 15, 16 } };
        System.out.println("Original Matrix:");
        printMatrix(matrix);
        zeroteMatrix(matrix);
        System.out.println("New Matrix:");
        printMatrix(matrix);

    }

    public static void printMatrix(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void zeroteMatrix(int[][] mat) {
        var xflags = new ArrayList<Integer>();
        var yflags = new ArrayList<Integer>();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 0) {
                    xflags.add(i);
                    yflags.add(j);
                }
            }
        }
        for (Integer i : xflags) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = 0;
            }
        }
        for (Integer j : yflags) {
            for (int i = 0; i < mat.length; i++) {
                mat[i][j] = 0;
            }
        }

    }
}