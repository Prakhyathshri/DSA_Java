package com.syntax;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3,4,1,2,5};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
/* It will start from 1st index, it will take the first element and check if its in the correct index
 It will know the relation of the element with the index, here its is ele - 1 = index, 1 - 1 = 0
 Because it is starting from 1, so it will check the correct index of the first element
 If the first element is not in the correct index, swap that 1st element to its correct index
 you will again get some other wrong element, or may be right element, so check again, till it becomes right
 If the first index has the right element only, it will move to next index. */

    static void cyclicSort(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]){
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
