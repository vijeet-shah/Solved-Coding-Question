package array_1;

/* Set Matrix Zero :
Problem Statement: Given a matrix if an element in the matrix is 0 then you will have to set its entire column and row to 0 and then return the matrix.
*/
/*  Input: matrix=[[1,1,1],
                   [1,0,1],
                   [1,1,1]] 

    Outut:  matrix=[[1,0,1],
                    [0,0,0],
                    [1,0,1]]
*/

/*
- Determine the number of rows and columns in the matrix.
- Create boolean arrays rowZeroes and colZeroes to store information about rows and columns that need to be zeroed.
- Iterate through the matrix and identify the positions where zeros are found, updating the corresponding elements in rowZeroes and colZeroes.
- Loop through the matrix again and set the rows and columns to zero based on the information stored in rowZeroes and colZeroes.
- Return the modified matrix. */

class Matrix {
    public static void setZeroes(int[][] matrix) {
        // Length of row & column
        int rows = matrix.length;
        int cols = matrix[0].length;
        /*
         * creates a boolean array named rowZeroes with a size equal to the number of
         * rows in the matrix. The rows variable is used here to determine the length of
         * the rowZeroes array.
         */
        boolean[] rowZeroes = new boolean[rows];
        boolean[] colZeroes = new boolean[cols];

        // Traverse through array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                /*
                 * If the condition is true, it means a zero is found at position (i, j) in the
                 * matrix.
                 * In that case, rowZeroes[i] = true sets the value at index i in the rowZeroes
                 * array to true. This indicates that the i-th row in the matrix needs to be set
                 * to zero.
                 * Similarly, colZeroes[j] = true sets the value at index j in the colZeroes
                 * array to true, indicating that the j-th column in the matrix needs to be set
                 * to zero.
                 */
                if (matrix[i][j] == 0) {
                    rowZeroes[i] = true;
                    colZeroes[j] = true;
                }
            }
        }

        // Set rows to zero
        for (int i = 0; i < rows; i++) {
            if (rowZeroes[i]) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Set columns to zero
        for (int j = 0; j < cols; j++) {
            if (colZeroes[j]) {
                for (int i = 0; i < rows; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 1, 1, 0, 1 },
                { 0, 0, 0, 1, 1 },
                { 1, 1, 1, 1, 1 }
        };

        setZeroes(matrix);

        // Print the modified matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
