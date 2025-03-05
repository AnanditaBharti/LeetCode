class Solution {
    public long coloredCells(int n) {
        if (n < 1)
            return 0;
        
        return 1 + 2 * (long)n * ((long)n-1);

        // int size = 2 * n - 1;
        // int[][] matrix = new int[size][size];

        // matrix[n - 1][n - 1] = 1; 
        // int count = 1;
        // for (int i = 1; i < n; i++) {
        // for (int row = 0; row < size; row++) {
        //     for (int col = 0; col < size; col++) {

        //         // System.out.print("matrix["+row+"]["+col+"] = ");

        //         if (matrix[row][col] >= 1)
        //             continue;
        //         if (row > 0 && matrix[row - 1][col] == i ) {
        //             matrix[row][col] = i + 1;

        //             // System.out.println(i+": matrix["+row+"]["+col+"] = " + matrix[row][col]);

        //             count ++;
        //             continue;
        //         }
        //         if (row < n - 1 && matrix[row + 1][col] == i) {
        //             matrix[row][col] = i + 1;

        //             // System.out.println(i+": matrix["+row+"]["+col+"] = " + matrix[row][col]);

        //             count ++;
        //             continue;
        //         }
        //         if (col > 0 && matrix[row][col - 1] == i) {
        //             matrix[row][col] = i + 1;

        //             // System.out.println(i+": matrix["+row+"]["+col+"] = " + matrix[row][col]);

        //             count ++;
        //             continue;
        //         }
        //         if (col < n-1 && matrix[row][col + 1] == i) {
        //             matrix[row][col] = i + 1;

        //             // System.out.println(i+": matrix["+row+"]["+col+"] = " + matrix[row][col]);

        //             count ++;
        //             continue;
        //         }
        //     }
        // }
        // }
        // return count;

    }
}