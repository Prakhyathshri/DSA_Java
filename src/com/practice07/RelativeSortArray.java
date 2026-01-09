package com.practice07;
// https://leetcode.com/problems/relative-sort-array/description/

import java.util.ArrayList;
import java.util.Arrays;

public class RelativeSortArray {
    public static void main(String[] args) {
        int[] arr1 = {2,21,43,38,0,42,33,7,24,13,12,27,12,24,5,23,29,48,30,31}, arr2 = {2,42,38,0,43,21};
        System.out.println(Arrays.toString(relativeSortArray(arr1, arr2)));
    }

    static int[] relativeSortArray(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        System.out.println("arr1 = " + Arrays.toString(arr1));
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j] == arr2[i]){
                    list.add(arr2[i]);
                }
            }
        }

        ArrayList<Integer> copy = new ArrayList<>(list);

        int i = 0;
        while (i < arr1.length){
            if (!copy.contains(arr1[i])) {
                list.add(arr1[i]);
            }
            i++;
        }

        int[] ans = new int[list.size()];
        for (int k = 0; k < ans.length; k++){
            ans[k] = list.get(k);
        }
        return ans;
    }
}
