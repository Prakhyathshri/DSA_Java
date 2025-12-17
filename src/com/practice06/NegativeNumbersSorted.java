package com.practice06;
// https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/description/

public class NegativeNumbersSorted {
    public static void main(String[] args) {
        int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.println(countNegatives(grid));
    }

    static int countNegatives(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            int j = 0;
            while (j < grid[i].length){
                if (grid[i][j] < 0){
                    count = count + (grid[i].length - j);
                    break;
                }
                j++;
            }
        }
        return count;
    }
}
