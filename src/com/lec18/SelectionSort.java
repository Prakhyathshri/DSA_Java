package com.lec18;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] selectSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            //find the max item in array and swap with correct index
            //arr.length = 5 | arr.length - 1 = 4 | - i = i.e = 0, when loop increases
            int last = arr.length - 1 - i;
            int maxindex = getMaxIndex(arr, 0, last);
            swap(arr, maxindex, last);
        }
        return arr;
    }

    static int getMaxIndex(int[] arr, int start, int last){
        int max = start;

        for (int i = start; i <= last ; i++){
            if (arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
