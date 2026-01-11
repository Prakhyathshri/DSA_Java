package com.practice15;

import java.util.Arrays;

public class ProductArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

    static int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int p = 1;
            for (int j = 0; j < nums.length; j++) {
                if (j != i){
                    p = p * nums[j];
                }
                ans[i] = p;
            }
        }
        return ans;
    }
}
