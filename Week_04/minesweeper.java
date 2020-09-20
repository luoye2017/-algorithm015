package com.example.leetcode.leetcode;

public class minesweeper {

    int[] dirX = {0, 1, 0, -1, 1, 1, -1, -1};
    int[] dirY = {1, 0, -1, 0, 1, -1, 1, -1};

    public char[][] updateBoard(char[][] board, int[] click) {
        int x = click[0];
        int y = click[1];

        if (board[x][y] == 'M') {
            board[x][y] = 'X';
        } else{
            dfs(board, x, y);
        }

        return board;
    }

    private void dfs(char[][] board, int x, int y) {
        int cnt = 0;
        for (int i = 0; i < 8; i++) {
            int tx = x + dirX[i];
            int ty = y + dirY[i];
            if (tx < 0 || ty <0 || tx > board.length-1 || ty > board[tx].length-1){
                continue;
            }
            if (board[tx][ty] == 'M'){
                cnt++;
            }
        }

        if (cnt > 0){
            board[x][y] = (char) (cnt + '0');
        }else {
            board[x][y] = 'B';
            for (int i = 0; i < 8; i++) {
                int tx = x + dirX[i];
                int ty = y + dirY[i];
                if (tx < 0 || ty <0 || tx > board.length-1 || ty > board[tx].length-1 || board[tx][ty] != 'E') {
                    continue;
                }
                dfs(board, tx, ty);
            }
        }
    }

    public static void main(String[] args) {
        minesweeper test = new minesweeper();

    }
}
