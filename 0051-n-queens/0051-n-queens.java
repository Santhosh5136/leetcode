class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> lis = new ArrayList<>();
        char array[][] = new char[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = '.';
            }
        }

        Nqueens(0, array, lis, n);
        return lis;

    }

    static void Nqueens(int col, char[][] array, List<List<String>> lis, int n) {
        if (col == n) {
            List<String> lis2 = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                String str = "";
                for (char c : array[i]) {
                    str = str + c;
                }
                lis2.add(str);
            }

            lis.add(lis2);
            return;
        }
        for (int row = 0; row < n; row++) {
            if (isSafe(row, col, array, n)) {
                array[row][col] = 'Q';
                Nqueens(col + 1, array, lis, n);
                array[row][col] = '.';

            }
        }
    }

    public static boolean isSafe(int row, int col, char[][] array, int n) {
        int r = row;
        int c = col;
        while (c >= 0) {
            if (array[row][c] == 'Q') {
                return false;
            }
            c--;
        }

        int uprow = row;
        int upcol = col;
        while (uprow >= 0 && upcol >= 0) {
            if (array[uprow][upcol] == 'Q') {
                return false;
            }
            uprow--;
            upcol--;
        }

        int downrow = row;
        int downcol = col;
        while (downrow < n && downcol >= 0) {
            if (array[downrow][downcol] == 'Q') {
                return false;
            }
            downrow++;
            downcol--;
        }

        return true;
    }
}