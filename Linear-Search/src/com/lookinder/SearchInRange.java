package com.lookinder;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = { 12,23,34,45,54,43,32,21,61,18};
        int target = 43;
        int ans = linearSearch(arr,target,2,7);
        System.out.println(ans);
    }
    static int linearSearch(int arr[], int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }
//        run for loop
        for(int i = start; i < end; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
