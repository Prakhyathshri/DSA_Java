package com.practiceTry;

public class HouseRobber {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(rob(nums));
    }

    static int rob(int[] nums){
        int zero = 0;
        int one = 0;
        for (int i = 0; i < nums.length; i+=2) {
            zero = zero + nums[i];
        }
        for (int i = 1; i < nums.length; i+=2) {
            one = one + nums[i];
        }
        if (zero > one){
            return zero;
        }
        return one;
    }


}
