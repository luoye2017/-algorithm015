package com.example.leetcode.leetcode;

public class number_of_islands {

    public int numIslands(char[][] grid) {

        int num = 0;

        for (int i = 0; i < grid.length; i++) {
            char[] chars = grid[i];
            for (int j = 0; j < chars.length; j++) {
                if (grid[i][j] == '1'){
                    num++;
                    dfs(grid, i, j);
                }
            }
        }

        return num;
    }

    private void dfs(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i > grid.length-1 || j > grid[i].length-1 || grid[i][j] == '0'){
            return;
        }
        grid[i][j] = '0';
        dfs(grid,i-1,j);
        dfs(grid,i+1,j);
        dfs(grid,i,j-1);
        dfs(grid,i,j+1);
    }

    public static void main(String[] args) {
        number_of_islands test = new number_of_islands();
        char[][] chars = new char[][]{
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}
        };

        int i = test.numIslands(chars);
        System.out.println(i);
    }
}

