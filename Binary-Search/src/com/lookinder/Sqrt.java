package com.lookinder;
//  https://leetcode.com/problems/sqrtx/

// Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
public class Sqrt {
    public static void main(String[] args) {
        int ans = mySqrt(16);
        System.out.println(ans);

    }
    static int mySqrt(int x) {
        if (x < 2)
            return x;

        int end = x / 2;

        int start = 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if ((long)mid*mid > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }
}
