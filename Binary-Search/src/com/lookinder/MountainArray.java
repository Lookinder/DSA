package com.lookinder;

//https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int ans = peakIndexInMountainArray(arr);
        System.out.println(ans);
    }
    static int peakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start) /2;
            if(arr[mid] > arr[mid +1]){
//                we are in the decreasing part of the array
//                this may be in the ans but look at left
//                this is why end is not != end -1
                end = mid;
            }
            else{
//          we are in the increasing part of the array
                start = mid +1;
//                because we know that mid +1 element > mid element

            }
        }
//        in the end, start == end and pointing to the largest number because of 2 checks above
//        start and end are always trying to find max element in the above 2 checks
//        hence, when they are pointing to just one element, that is the max one because that is what the checks say
//        more elaboration : at every point of the time for start and end, they have the possible answer till that time
//        and if we are saying that only one item is remaining, hence cus of above line is the best possible value
        return arr[start];
    }
}
