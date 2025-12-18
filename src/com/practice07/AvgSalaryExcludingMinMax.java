package com.practice07;
// https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/description/

import java.util.Arrays;

public class AvgSalaryExcludingMinMax {
    public static void main(String[] args) {
        int[] salary = {4000,3000,1000,2000};
        System.out.println(average(salary));
    }

    static double average(int[] salary) {
        Arrays.sort(salary);
        int div = salary.length - 2;
        double sum = 0;
        for (int i = 1; i <= salary.length - 2; i++) {
            sum = sum + salary[i];
        }
        return sum/div;
    }
}
