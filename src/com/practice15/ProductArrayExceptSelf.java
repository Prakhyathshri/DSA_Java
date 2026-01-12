package com.practice15;

import java.util.Arrays;

public class ProductArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};

    }

    static int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        ans[0] = 1;

        for (int i = 1; i < nums.length; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        int x = 1;
        for (int i = nums.length - 1; i >= 0 ; i--) {
            ans[i] = ans[i] * x;
            x = x * nums[i];
        }
        return ans;
    }
}
