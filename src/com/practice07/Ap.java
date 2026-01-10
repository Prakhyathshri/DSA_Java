package com.practice07;
// https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/description/
import java.util.Arrays;

public class Ap {
    public static void main(String[] args) {
        int[] arr = {3,5,1};
        System.out.println(canMakeArithmeticProgression(arr));
    }

    static boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int dif = arr[1] - arr[0];
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] != dif){
                return false;
            }
        }
        return true;
    }
}
