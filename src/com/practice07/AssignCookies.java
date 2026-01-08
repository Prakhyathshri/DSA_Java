package com.practice07;

import java.util.Arrays;

public class AssignCookies {
    public static void main(String[] args) {
        int[] g = {1,2}, s = {1,2,3};
        System.out.println(findContentChildren(g, s));
    }

    static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        int k = 0;
        int i = 0;
        while (i < g.length){
            int j = k;
            while (j < s.length){
                if (g[i] <= s[j]){
                    count++;
                    k = j + 1;
                    break;
                }
                j++;
            }
            i++;
        }
        return count;
    }
}
