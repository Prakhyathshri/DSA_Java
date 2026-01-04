package com.practice05;

import java.util.Arrays;

public class OneDArrayToTwoDArray {
    public static void main(String[] args) {
        int[] original = {1,2};
        int m = 1, n = 1;
        System.out.println(Arrays.deepToString(construct2DArray(original, m, n )));
    }

    static int[][] construct2DArray(int[] original, int m, int n) {
        if (m * n > original.length){
            int[][] ans = {original};
            return ans;
        }
        if (m * n < original.length){
            int[][] ans = new int[0][0];
            return ans;
        }
        int[][] ans = new int[m][n];
        int x = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans[i][j] = original[x];
                x++;
            }
        }
        return ans;
    }
}
