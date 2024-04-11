package game;

import board.NQueenBoard;

public class NQueenGame {
    NQueenBoard q;

    public NQueenGame(NQueenBoard q) {
        this.q = q;
    }

    public void play() {
        if (q.size < 4) {
            System.out.println("No configuration possible");
            return;
        }

        nQueen_helper(q.board, 0);
    }

    public void nQueen_helper(char[][] board, int row) {
        if (row == board.length) {
            printBoard(board);
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (isSafeQueen(board, row, col)) {
                board[row][col] = 'Q';
                nQueen_helper(board, row + 1);
                board[row][col] = '-';
            }
        }
    }

    private boolean isSafeQueen(char[][] board, int row, int col) {
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q')
                return false;
        }

        for (int i = row; i >= 0; i--) {
            if (board[i][col] == 'Q')
                return false;
        }

        return true;
    }

    private void printBoard(char[][] board) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

}
