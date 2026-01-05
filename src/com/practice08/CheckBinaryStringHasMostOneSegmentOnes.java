package com.practice08;

public class CheckBinaryStringHasMostOneSegmentOnes {
    public static void main(String[] args) {
        String s = "1001";
        System.out.println(checkOnesSegment(s));
    }

    static boolean checkOnesSegment(String s) {
        boolean ans = true;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1' && i > 0 && s.charAt(i - 1) == '0'){
                ans = false;
            }
        }
        return ans;
    }
}
