package com.practice07;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {2,1}, nums2 = {1,2};
        System.out.println(Arrays.toString(intersection(nums1,nums2)));
    }

    static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
        System.out.println("Sorted");

        ArrayList<Integer> a = duplicateCheck(nums1);
        ArrayList<Integer> b = duplicateCheck(nums2);

        System.out.println(a);
        System.out.println(b);
        System.out.println("Duplicates Removed");

        int[] x = convertArr(a);
        int[] y = convertArr(b);

        ArrayList<Integer> f = new ArrayList<>();

        int i = 0;
        while (i < x.length){
            int j = 0;
            while (j < y.length){
                if (x[i] == y[j]){
                    f.add(x[i]);
                    break;
                } else {
                    j++;
                }
            }
            i++;
        }

        System.out.println("Final answer");
        System.out.println(f);
        return convertArr(f);
    }

    static int[] convertArr (ArrayList<Integer> ans){
        int[] x = new int[ans.size()];
        for (int k = 0; k < x.length; k++) {
            x[k] = ans.get(k);
        }
        return x;
    }

    static ArrayList<Integer> duplicateCheck(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!ans.contains(arr[i])){
                ans.add(arr[i]);
            }
        }
        return ans;
    }
}
