package com.lookinder;

import java.util.Arrays;

public class runningSum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] ans = runningSum(nums);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] runningSum(int[] nums){
        int n = nums.length;
        int[] result = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++){
            result[i] = sum + nums[i];
            sum = sum + nums[i];
        }

        return result;
    }
}
