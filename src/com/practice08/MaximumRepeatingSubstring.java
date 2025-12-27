//package com.practice08;
//
//public class MaximumRepeatingSubstring {
//    public static void main(String[] args) {
//        String sequence = "a", word = "a";
//        System.out.println(maxRepeating(sequence, word));
//    }
//
//    static int maxRepeating(String sequence, String word) {
//        if (sequence.length() < word.length()){
//            return 0;
//        }
//        int jump = word.length();
//        int count = 0;
//        int i = 0;
//        while (i < sequence.length() - jump){
//            if (sequence.substring(i, i + jump) .equals(word)){
//                count++;
//                i = i + jump;
//            } else {
//                i++;
//            }
//        }
//        return count;
//    }
//}
