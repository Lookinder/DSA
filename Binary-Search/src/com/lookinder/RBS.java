package com.lookinder;

public class RBS {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2,3};
        System.out.println(pivot(arr));
    }

    static int search(int[] nums, int target) {
        int findPivot = pivot(nums);

//        if we did not find a pivot it means array is not rotated
        if (findPivot == -1) {

//        just do normal binary search
            return binarySearch(nums, target, 0, nums.length - 1);
        }
//            if pivot is found we have found 2 asc array
            if(nums[findPivot]==target){
                return findPivot;
            }
            if(target >= nums[0]){
                return binarySearch(nums,target,0,findPivot -1);
            }
            return binarySearch(nums,target,findPivot+1,nums.length - 1);

    }

    static int binarySearch(int[] arr, int target, int start, int end ) {


        while (start <= end) {
//            find the middle element
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;

            }
        }
        return  -1;
    }
    static int pivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (start < mid && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            } else if (arr[mid] < arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
            return -1;
        }

}
