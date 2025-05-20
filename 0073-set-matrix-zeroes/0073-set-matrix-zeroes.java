class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        int[][] ans = new int[row][col];

        // Step 1: Copy the original matrix to ans
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                ans[i][j] = matrix[i][j];
            }
        }

        // Step 2: Set rows and columns to zero in ans if a zero is found in matrix
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0) {
                    for (int k = 0; k < col; k++) {
                        ans[i][k] = 0;
                    }
                    for (int k = 0; k < row; k++) {
                        ans[k][j] = 0;
                    }
                }
            }
        }

        // Step 3: Copy ans back to matrix
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = ans[i][j];
            }
        }
    }
}
