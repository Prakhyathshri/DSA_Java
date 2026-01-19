package com.practiceTry;
// https://leetcode.com/problems/search-in-rotated-sorted-array/description/

public class SearchRotatedSortedArray {
    public static void main(String[] args) {
        int[]  nums = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(nums, target));
    }

    static int search(int[] nums, int target) {
        int p = findPivot(nums);

        if (target > nums[nums.length - 1]){
            return binarySearch(nums, target, 0, p);
        } else {
            return binarySearch(nums, target, p, nums.length);
        }
    }

    static int findPivot(int[] nums){
        int s = 0, e = nums.length - 1;

        while (s < e){
            int m = s + (e - s)/2;

            if (nums[m] > nums[e]){
                s = m + 1;
            } else {
                e = m;
            }
        }
        return s;
    }

    static int binarySearch (int arr[], int target, int s, int e){
        while (s <= e){
            int m = s + (e - s)/2;

            if (arr[m] == target){
                return m;
            } else if (arr[m] > target){
                e = m - 1;
            } else {
                s = m + 1;
            }
        }
        return -1;
    }
}
