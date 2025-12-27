package com.lec32;

import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
        subSeq("", "abc");
        System.out.println(subSeq2("","abc",new ArrayList<>()));
        System.out.println(subSeq3("", "abc"));
    }

    static ArrayList<String> subSeq3(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> left = subSeq3(p + ch, up.substring(1));
        ArrayList<String> right = subSeq3(p, up.substring(1));

        left.addAll(right);
        return left;
    }

    static ArrayList<String> subSeq2(String p, String up, ArrayList<String> list){
        if (up.isEmpty()){
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        subSeq2(p + ch, up.substring(1), list);
        subSeq2(p, up.substring(1), list);

        return list;
    }

    static void subSeq(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subSeq(p + ch, up.substring(1));  // add it - add the first char of up
        subSeq(p, up.substring(1));          // ignored it
    }
}
