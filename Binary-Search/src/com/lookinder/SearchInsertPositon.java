package com.lookinder;

import java.util.Arrays;

public class SearchInsertPositon {
    public static void main(String[] args) {
        int[] nums = {1,4,6,8,9};
        int target = 5;
        int ans = insert(nums,target);
        System.out.println(ans);
    }
    public static int insert(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;

        while(start<=end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] > target){
                end = mid -1;
            }
            else{
                start = mid +1;
            }
        }
        return end + 1;
    }
}

