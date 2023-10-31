package com.lookinder;

// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/submissions/905227882/
// Q. Find the first and last position of element in sorted array

import java.util.Arrays;

public class FirstAndLast {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,5,5,6,7,8,9};
        int target = 5;
        System.out.println(Arrays.toString(searchRange(num, target)));
    }
    static int[] searchRange(int[] num, int target) {
        int[] ans = {-1,-1};
        // check for first occurrence if target first
        int start = search(num, target, true);
        int end = search(num, target, false);

        ans[0] = start;
        ans[1] = end;
        System.out.println();
        return ans;
    }

    // this function just returns the index value of target
    static int search(int[] num, int target, boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = num.length-1;
        while(start <= end){

            // find the middle element
            int mid = start + (end - start) / 2;

            if(target < num[mid]){
                end = mid -1;
            }
            else if(target > num[mid]){
                start = mid +1;
            }
            else{
                ans = mid;
                if(findStartIndex){
                    end = mid -1;
                }
                else{
                    start = mid +1;
                }
            }
        }
        return ans;
    }
}

