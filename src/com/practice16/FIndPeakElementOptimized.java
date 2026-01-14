package com.practice16;

public class FIndPeakElementOptimized {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(findPeakElementOptimized(nums));
    }

    static int findPeakElementOptimized(int[] nums){
        if (nums.length == 1){
            return 0;
        }
        int s = 0;
        int e = nums.length - 1;
        while (s < e){
            int m = s + (e - s)/2;
            if (nums[m] < nums[m + 1]){
                s = m + 1;
            } else {
                e = m;
            }
        }
        return s;
    }
}
