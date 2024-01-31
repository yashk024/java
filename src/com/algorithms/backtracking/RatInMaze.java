package com.algorithms.backtracking;

import java.util.ArrayList;

public class RatInMaze {

    static char[] directions = { 'D', 'L', 'R', 'U' };
    static int[] rowChange = { 1, 0, 0, -1 };
    static int[] columnChange = { 0, -1, 1, 0 };

    public static ArrayList<String> findPaths(int[][] maze) {
        var allPaths = new ArrayList<String>();
        var currentPath = new StringBuilder();
        findPaths(maze, 0, 0, currentPath, allPaths);
        return allPaths;
    }

    private static void findPaths(int[][] maze, int x, int y, StringBuilder currentPath, ArrayList<String> allPaths) {
        if (isSafe(maze, x, y)) {
            if (x == maze.length - 1 && y == maze.length - 1) {
                allPaths.add(currentPath.toString());
                return;
            }
            maze[x][y] = 0;
            for (int i = 0; i < 4; i++) {
                currentPath.append(directions[i]);
                findPaths(maze, x + rowChange[i], y + columnChange[i], currentPath, allPaths);
                currentPath.deleteCharAt(currentPath.length() - 1);
            }
            maze[x][y] = 1;
        }
    }

    private static boolean isSafe(int[][] maze, int x, int y) {
        return x >= 0 && y >= 0 && x < maze.length && y < maze.length && maze[x][y] == 1;
    }

    public static void main(String[] args) {
        int[][] maze = {
                { 1, 0, 0, 0 },
                { 1, 1, 0, 0 },
                { 1, 1, 0, 0 },
                { 0, 1, 1, 1 }
        };
        System.out.println(findPaths(maze));
    }

}
