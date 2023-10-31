package com.lookinder;

public class RemoveChr {

    public static void main(String[] args) {
        String ans = skipAppleNotApple("bcappleappdaca");
        System.out.println(ans);
    }

    static void skip(String s, String up) {
        if (up.isEmpty()) {
            System.out.println(s);
            return;
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            skip(s, up.substring(1));
        } else {
            skip(s + ch, up.substring(1));
        }
    }

    static String skip(String up) {
        if (up.isEmpty()) {
            return "";
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            return skip(up.substring(1));
        } else {
            return ch + skip(up.substring(1));
        }
    }

    static String skipApple(String up) {
        if (up.isEmpty()) {
            return "";
        }

        if (up.startsWith("apple")) {
            return skipApple(up.substring(5));
        } else {
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }


    static String skipAppleNotApple(String up) {
        if (up.isEmpty()) {
            return "";
        }

        if (up.startsWith("app") && !up.startsWith("apple")) {
            return skipAppleNotApple(up.substring(3));
        } else {
            return up.charAt(0) + skipAppleNotApple(up.substring(1));
        }


    }
}
