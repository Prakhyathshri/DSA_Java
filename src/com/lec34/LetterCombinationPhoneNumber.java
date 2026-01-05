package com.lec34;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LetterCombinationPhoneNumber {
    public static void main(String[] args) {
        int digits = 23;
//        pad("","12");
        System.out.println(padArr("", "12"));
//        System.out.println(padCount("","12"));
    }

    static void pad(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0';
        // This will convert '2' into 2, it will convert String into int

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char)('a' + i);
            pad(p + ch, up.substring(1));
        }
    }

    static List<String> padArr(String p, String up){
        if (up.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        List<String> ans = new ArrayList<>();

        int digit = up.charAt(0) - '0';

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char)('a' + i);
            ans.addAll(padArr(p + ch, up.substring(1)));
        }
        return ans;
    }

    static int padCount(String p, String up){
        if (up.isEmpty()){
            return 1;
        }
        int count = 0;
        int digit = up.charAt(0) - '0';

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char)('a' + i);
            count = count + padCount(p + ch, up.substring(1));
        }
        return count;
    }
}
