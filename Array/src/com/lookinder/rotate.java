package com.lookinder;

import java.util.Arrays;

public class rotate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int target = 3;
        System.out.println(Arrays.toString(rotate(nums,target)));
    }

    public static void swap(int[] nums,int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public static int[] rotate(int[] nums, int target){
        if (target > nums.length) {
            target = target % nums.length; // Ensure target is within array bounds
        }
        swap(nums,0,nums.length-1);
        swap(nums,0,target-1);
        swap(nums,target, nums.length-1);

        return nums;
    }
}
