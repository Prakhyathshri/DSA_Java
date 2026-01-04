package com.practice05;

import java.util.Arrays;

public class ReshapeMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1,2},{3,4}}; 
        int r = 2, c = 4;
        System.out.println(Arrays.deepToString(matrixReshape(mat, r, c)));
    }

    static int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[mat.length - 1].length;
        int[] original = new int[m * n];
        int x = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                original[x] = mat[i][j];
                x++;
            }
        }
//        System.out.println(Arrays.toString(original));
        if (r * c != original.length){
            return mat;
        }
        int[][] ans = new int[r][c];
        int y = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ans[i][j] = original[y];
                y++;
            }
        }
        return ans;
    }
}
