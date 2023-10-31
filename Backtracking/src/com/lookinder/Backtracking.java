package com.lookinder;

import java.util.Arrays;

public class Backtracking {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true},
        };
        int[][] path = new int[board.length][board[0].length];
        pathPrint("",board,0,0,path, 1);

    }

    static void pathAll(String p, boolean[][] maze, int r, int c){
        if(r == maze.length - 1 && c == maze[0].length - 1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }

//        considering this block in path
        maze[r][c] = false;
        if(r < maze.length - 1){
            pathAll(p + 'D', maze, r + 1, c);
        }
        if(c < maze[0].length - 1){
            pathAll(p + 'R', maze, r, c +1);
        }
        if(r > 0){
            pathAll(p +'U',maze, r - 1, c);
        }
        if(c > 0){
            pathAll(p + 'L',maze, r, c-1);
        }
//        this line where the function will over
//        so before the function gets remover, also remove the changes that were made by that function
        maze[r][c] = true;
    }

    static void pathPrint(String p, boolean[][] maze, int r, int c, int[][] path, int step){
        if(r == maze.length - 1 && c == maze[0].length - 1){
            path[r][c] = step;
                for(int[] arr: path){
                    System.out.println(Arrays.toString(arr));
                }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(!maze[r][c]){
            return;
        }

//        considering this block in path
        maze[r][c] = false;
        path[r][c] = step;
        if(r < maze.length - 1){
            pathPrint(p + 'D', maze, r + 1, c, path, step + 1);
        }
        if(c < maze[0].length - 1){
            pathPrint(p + 'R', maze, r, c +1, path, step + 1);
        }
        if(r > 0){
            pathPrint(p +'U',maze, r - 1, c, path, step + 1);
        }
        if(c > 0){
            pathPrint(p + 'L',maze, r, c-1, path, step + 1);
        }
//        this line where the function will over
//        so before the function gets remover, also remove the changes that were made by that function
        maze[r][c] = true;
        path[r][c] = 0;
    }
}
