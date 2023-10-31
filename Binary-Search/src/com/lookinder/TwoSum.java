package com.lookinder;

import java.util.Arrays;

// Two Sum II - Input Array Is Sorted
public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {-3,3,4,90};
        int target = 0;
        System.out.println(Arrays.toString(sum(arr, target)));
    }

    public static int[] sum(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                end = mid+1;
            } else if (arr[mid] >= target) {
                end = mid;
            }

            for (int i = 0; i <= end; i++) {
                for (int j = i + 1; j <= end; j++) {
                    if (arr[i] + arr[j] == target) {
                        return new int[]{i+1, j+1};
                    }
                }
            }
        }
        return new int[]{-1, -1};
    }
}
