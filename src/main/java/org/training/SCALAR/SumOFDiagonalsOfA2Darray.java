package org.training.SCALAR;

public class SumOFDiagonalsOfA2Darray {

    public int solve(final int[][] A) {
        int sum = 0;
        int row = 0;
        int col = 0;
        while (row < A.length && col < A[0].length) {
            sum += A[row][col];
            row++;
            col++;

        }
        return sum;

    }

    public int solveAnti(final int[][] A) {
        int sum = 0;
        int row = 0;
        int col = A[0].length - 1;
        while (row < A.length && col >= 0) {
            sum += A[row][col];
            row++;
            col--;

        }
        return sum;

    }


    public static void AntiDiagonalSolution(int[][] A) {

        int colSize =A[0].length;
        int rowSize =A.length;

        int resultArr[][] = new int[colSize + rowSize - 1][colSize];

        int row = 0;
        int resultRow=0;
        int resultCol=0;
        for (int col = 0; col < colSize; col++) {

            int i =row; int j =col;
            resultCol=0;
            while(i < rowSize && j>=0){
                System.out.print(A[i][j] );
                System.out.print(" ");
                resultArr[resultRow][resultCol++]=A[i][j];
                i++;
                j--;
            }
           /* while(resultCol!=colSize-1){
                resultArr[resultRow][resultCol++]=0;
                resultCol++;
            }*/
            resultRow++;
            System.out.println();

        }

        int col = colSize-1;
        for ( row = 1; row < rowSize; row++) {

            int i =row; int j =col;  resultCol=0;
            while(i < rowSize && j>=0){
                System.out.print(A[i][j] );
                System.out.print(" ");
                resultArr[resultRow][resultCol++]=A[i][j];
                i++;
                j--;
            }
            while(resultCol!=colSize-1){
                resultArr[resultRow][resultCol++]=0;
                resultCol++;
            }
            resultRow++;
            System.out.println();
        }


    }

    public static int[][] solveTranspose(int[][] A) {
        int colSize =A[0].length;
        int rowSize =A.length;
        int resultArr[][] = new int[colSize][rowSize];

        for (int row = 0; row <= rowSize-1; row++) {
            for (int col = row+1; col < colSize ; col++) {
                resultArr[col][row] =A[row][col];
                resultArr[row][col] =A[col][row];
            }
        }

        for (int i = 0; i < rowSize ; i++) {
            resultArr[i][i] =A[i][i];
        }

        return resultArr;
    }
    public static int[][] solveTransposeNoNSquare(int[][] A) {
        int colSize =A[0].length;
        int rowSize =A.length;
        int resultArr[][] = new int[colSize][rowSize];

        for (int row = 0; row < rowSize; row++) {
            for (int col = 0; col < colSize ; col++) {
                resultArr[col][row] =A[row][col];
            }
        }

        return resultArr;
    }

    public static int[][] solveTransposeSqaureInplace(int[][] A) {
        int colSize =A[0].length;
        int rowSize =A.length;


        for (int row = 0; row < rowSize; row++) {
            for (int col = row; col < colSize ; col++) {
              int temp =A[row][col];
                A[row][col]= A[col][row];
                A[col][row]=temp;
            }
        }

        return A;
    }
    public static int[][] ReverseRow(int[][] A) {
        int colSize =A[0].length;
        int rowSize =A.length;


        for (int row = 0; row < rowSize; row++) {
            int i =0; int j = colSize-1;

            while(i<j)
            {
                int temp =A[row][j];
                A[row][j]=A[row][i];
                A[row][i]=temp;

                i++;
                j--;
            }
        }

        return A;
    }


//    public static int[][] rotate90(){
//
//    }

    public static void main(String[] args) {

        int inputArr[][] = new int[2][2];
        inputArr[0][0]=1;
        inputArr[0][1]=2;
        inputArr[1][0]=3;
        inputArr[1][1]=4;
      /*  AntiDiagonalSolution(inputArr);

        solveTransposeSqaureInplace(inputArr)*/;

        solveRorate90(inputArr);

    }
    public static void solveRorate90(int[][] A) {

        A= solveTransposeSqaureInplace(A);
        A= ReverseRow(A);

    }


}
