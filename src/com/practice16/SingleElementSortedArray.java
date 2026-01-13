package com.practice16;
// https://leetcode.com/problems/single-element-in-a-sorted-array/description/

public class SingleElementSortedArray {
    public static void main(String[] args) {
        int[] nums = {3, 3, 7, 7, 10, 11, 11};
        System.out.println(singleNonDuplicate(nums));
    }

    static int singleNonDuplicate(int[] nums) {
        if (nums.length == 1){
            return nums[0];
        }
        int i = 0;
        while (i < nums.length - 1) {
            if (nums[i] == nums[i + 1]) {
                i += 2;
            } else {
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }
}
