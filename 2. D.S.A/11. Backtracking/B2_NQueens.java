public class B2_NQueens {

    static int count = 0;

    // 1. issafe function...
    public static boolean isSafe(char board[][], int row, int col) {

        // 1. upside
        for(int i=row-1;i>=0;i--) {
            if(board[i][col]=='Q') return false;
        }
        // 2. Left-up corner
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--) {
            if(board[i][j]=='Q') return false;
        }
        // 3. right-up corner
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++) {
            if(board[i][j]=='Q') return false;
        }

        return true;
    }

        // 2. check all possible solution..
    public static void nQueens(char board[][], int row) {
        if(row==board.length) {
            printBoard(board);
            count++;
            return;
        }

        // Put queen basis of column...
        for(int j=0;j<board.length;j++) {
            if(isSafe(board,row,j)) {
                board[row][j] = 'Q';
                nQueens(board, row+1);                  // Function call...
                board[row][j] = 'x';                    // Backtracking...
            }
        }
    }

    // 3. check atr least 1 solution is possible or not...
    public static boolean nQueens1(char board[][], int row) {
        if(row==board.length) {
            return true;
        }

        // Put queen basis of column...
        for(int j=0;j<board.length;j++) {
            if(isSafe(board,row,j)) {
                board[row][j] = 'Q';
                if(nQueens1(board, row+1)) {
                    return true;
                }                
                board[row][j] = 'x';                   
            }
        }

        return false;

    }

    // 4. Print the chase board...
    public static void printBoard(char board[][]) {
        for(int i=0;i<board.length;i++) {
            for(int j=0;j<board.length;j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("_ _ _ _ _ _ _ ");
    }
    public static void main(String[] args) {
        int n = 5;
        char board[][] = new char[n][n];

        // Initilize...
        for(int i=0;i<board.length;i++) {
            for(int j=0;j<board.length;j++) {
                board[i][j] = 'x';
            }
        } 

        // nQueens(board, 0);
        // System.out.println(count);

        if(nQueens1(board, 0)) {
            System.out.println("the solution is possible.");
            printBoard(board);
        } else {
            System.out.println("The solution is not possible.");
        }
    }
}


/*
 * public class Solution {
    private int count = 0;

    public int totalNQueens(int n) {
        boolean[] cols = new boolean[n];        // columns
        boolean[] diag1 = new boolean[2 * n];   // major diagonal (r + c)
        boolean[] diag2 = new boolean[2 * n];   // minor diagonal (r - c + n)
        backtrack(0, n, cols, diag1, diag2);
        return count;
    }

    private void backtrack(int row, int n, boolean[] cols, boolean[] diag1, boolean[] diag2) {
        if (row == n) {
            count++;
            return;
        }

        for (int col = 0; col < n; col++) {
            int d1 = row + col;
            int d2 = row - col + n;

            if (cols[col] || diag1[d1] || diag2[d2]) continue;

            // Place queen
            cols[col] = diag1[d1] = diag2[d2] = true;

            // Move to next row
            backtrack(row + 1, n, cols, diag1, diag2);

            // Remove queen (backtrack)
            cols[col] = diag1[d1] = diag2[d2] = false;
        }
    }
}

 */