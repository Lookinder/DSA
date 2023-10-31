package com.lookinder;

import java.util.Arrays;

public class Concanate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        int[] ans = concatenate(nums);
        System.out.println(Arrays.toString(ans));
    }

    static int[] concatenate(int[] nums) {
        int n = nums.length;
        int[] result = new int[2 * n];

        // Copy elements of the input array into the result array twice
        for (int i = 0; i < 2 * n; i++) {
            result[i] = nums[i % n];
        }

        return result;
    }
}






