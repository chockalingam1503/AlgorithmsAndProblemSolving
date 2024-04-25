package org.training.SCALAR;

public class RowToColoumnZero {

    public static int[][] solve(int[][] A) {


        int rowLength = A.length;
        int colLength = A[0].length;

        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                if (A[i][j] == 0) {

                    int row = i;
                    int col = 0;
                    while (col < colLength) {
                        if(A[row][col]!=0) {
                            A[row][col] = -1;
                        }
                        col++;
                    }
                    col = j;
                    row = 0;
                    while (row < rowLength) {
                        if(A[row][col]!=0) {
                            A[row][col] = -1;
                        }
                        row++;
                    }

                }
            }

        }

        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                if (A[i][j] == -1) {
                    A[i][j] = 0;
                }
            }
        }

        return A;
    }

    public static void main(String[] args) {
        solve(new int[][]{{2, 3, 6, 7}, {2, 0, 4, 0}});
    }
}
