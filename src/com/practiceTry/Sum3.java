package com.practiceTry;

import java.util.*;

public class Sum3 {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }

    static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> fans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (j != i){
                    for (int k = 0; k < nums.length; k++) {
                        if (k != i && k != j){
                            if (nums[i] + nums[j] + nums[k] == 0){
                                ArrayList<Integer> ans = new ArrayList<>();
                                ans.add(nums[i]);
                                ans.add(nums[j]);
                                ans.add(nums[k]);
                                Collections.sort(ans);
                                if (!fans.contains(ans)){
                                    fans.add(ans);
                                }
                            }
                        }
                    }
                }
            }
        }
        return fans;
    }
}
