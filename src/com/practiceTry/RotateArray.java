package com.practiceTry;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {-1};
        int k = 2;
        rotate2(nums, k);
    }

    // This is total raw brute force, and has edge case errors, you need to solve in a optimized way
    static void rotate2(int[] nums, int k) {
        if (nums.length < k){
            return;
        }
        int[] ans = new int[nums.length];
        int x = 0;
        for (int i = nums.length - k; i < nums.length; i++) {
            ans[x] = nums[i];
            x++;
        }
        x = k;
        for (int i = 0; i < nums.length - k; i++) {
            ans[x] = nums[i];
            x++;
        }
        System.out.print("[");
        for (int i = 0; i < ans.length; i++) {
            if (i == ans.length - 1){
                System.out.print(ans[i]);
            } else {
                System.out.print(ans[i] + ",");
            }
        }
        System.out.print("]");
        for (int i = 0; i < ans.length; i++) {
            nums[i] = ans[i];
        }
    }
}
