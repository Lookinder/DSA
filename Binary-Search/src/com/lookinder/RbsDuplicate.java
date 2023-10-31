package com.lookinder;

public class RbsDuplicate {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2,3};
        System.out.println(pivotWithDuplicate(arr));
    }

    static int search(int[] nums, int target) {
        int findPivot = pivotWithDuplicate(nums);

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
    static int pivotWithDuplicate(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (start < mid && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
//            if elements at middle, start, end are equal then just skip the dplicates
            if(arr[start] == arr[mid]  && arr[mid] == arr[end]){
//                skip the duplicates
//                NOTE: what if these elements at stat and end were the pivot?
//                check if start is pivot
                if(arr[start] > arr[start+1]){
                    return start;
                }
                start++;

//                check whether end is pivot
                if (arr[end] < arr[end -1]){
                    return end-1;
                }
                end--;
            }
//            left side is sorted, so pivot should be in right
            else if (arr[start] <arr[mid] || (arr[start] == arr[mid]  && arr[mid] > arr[end])){
                start = mid +1;
            }
            else{
                end = mid -1;
            }
        }
        return -1;
    }
}

