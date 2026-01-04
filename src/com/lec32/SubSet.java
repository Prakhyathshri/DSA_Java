package com.lec32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSet {
    public static void main(String[] args) {
//        int[] arr = {1,2,3};
//        List<List<Integer>> ans = subSet(arr);
//        for(List<Integer> list : ans){
//            System.out.println(list);
//        }
        int[] a = {1,2,2};
        List<List<Integer>> ans = subSetDuplicate(a);
        for(List<Integer> list : ans){
            System.out.println(list);
        }
    }

    static List<List<Integer>> subSet(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for(int num: arr){
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                // This is a copy constructor, creates a
                // copy of list at i th from outer, outer is untouched

                internal.add(num);
                // Now we have a copy of [] we are adding num i.e 1, so it becomes [1]

                outer.add(internal);
                // internal is [1], now we add that to outer
                // outer become [], [1]
            }
        }

        return outer;
    }

    static List<List<Integer>> subSetDuplicate(int[] arr){
        Arrays.sort(arr);

        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++){
            start = 0;
            // if start & previous ele is same, s = e + 1
            if (i > 0 && arr[i] == arr[i - 1]){
                start = end + 1;
            }
            end = outer.size() - 1;
            int n = outer.size();
            for (int j = start; j < n; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
}
