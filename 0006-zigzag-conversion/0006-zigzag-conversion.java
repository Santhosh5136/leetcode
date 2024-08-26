class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s; // Special case for single row

        char[][] array = new char[numRows][s.length()];
        int l = 0;
        int row = 0;
        int col = 0;
        boolean goingDown = true;

        while (l < s.length()) {
            array[row][col] = s.charAt(l);
            l++;

            if (goingDown) {
                if (row < numRows - 1) {
                    row++;
                } else {
                    row--;
                    col++;
                    goingDown = false;
                }
            } else {
                if (row > 0) {
                    row--;
                    col++;
                } else {
                    row++;
                    goingDown = true;
                }
            }
        }

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < s.length(); j++) {
                if (array[i][j] != 0) {
                    ans.append(array[i][j]);
                }
            }
        }

        return ans.toString();
    }
}
