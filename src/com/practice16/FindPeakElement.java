package com.practice16;

public class FindPeakElement {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(findPeakElement(nums));
    }

    static int findPeakElement(int[] nums) {
        if (nums.length == 1){
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                if (nums[i] > nums[i + 1]){
                    return i;
                }
            }
            if (i == nums.length - 1){
                if (nums[i] > nums[i - 1]){
                    return i;
                }
            }
            if ( i != 0 && i != nums.length - 1){
                if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]){
                    return i;
                }
            }
        }
        return -1;
    }
}
