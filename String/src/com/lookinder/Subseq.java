package com.lookinder;

import java.util.ArrayList;

public class Subseq {
    public static void main(String[] args) {
//        ArrayList<String> subsequence = new ArrayList<>();
        System.out.println(subSeqAsci("", "abc"));

    }

    static void subSeq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subSeq(p +ch, up.substring(1));
        subSeq(p, up.substring(1));
    }

    static ArrayList<String> subSeqRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subSeqRet(p + ch, up.substring(1));
        ArrayList<String> right = subSeqRet(p, up.substring(1));
        left.addAll(right);
        return left;
    }

    static void subSeqRet(String p, String up, ArrayList<String> result) {
        if (up.isEmpty()) {
            result.add(p);
        } else {
            char ch = up.charAt(0);
            subSeqRet(p + ch, up.substring(1), result);
            subSeqRet(p, up.substring(1), result);
        }
    }

    static void subSeqAscii(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subSeqAscii(p +ch, up.substring(1));
        subSeqAscii(p, up.substring(1));
        subSeqAscii(p + (ch + 0), up.substring(1));
    }

    static ArrayList<String> subSeqAsci(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> first = subSeqAsci(p + ch, up.substring(1));
        ArrayList<String> second = subSeqAsci(p, up.substring(1));
        ArrayList<String> third = subSeqAsci(p + (ch + 0), up.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first;
    }
}

