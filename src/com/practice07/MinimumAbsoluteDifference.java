package com.practice07;
// https://leetcode.com/problems/minimum-absolute-difference/description/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference {
    public static void main(String[] args) {
        int[] arr = {4,2,1,3};
        System.out.println(minimumAbsDifference(arr));
    }

    static List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i + 1] - arr[i] < min){
                    min = arr[i + 1] - arr[i];
                }
        }
        List<List<Integer>> check = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] == min) {
                    ArrayList<Integer> ans = new ArrayList<>();
                    ans.add(arr[i]);
                    ans.add(arr[i + 1]);
                    check.add(ans);
            }
        }
        return check;
    }
}
