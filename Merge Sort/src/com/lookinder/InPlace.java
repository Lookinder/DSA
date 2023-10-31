package com.lookinder;

import java.util.Arrays;

public class InPlace {
    public static void main(String[] args) {
        int[] arr = { 5,4,3,2,1};
        mergeSortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));

    }

    static void mergeSortInPlace(int[] arr, int s, int e) {
        if (e-s <= 1) {
            return;
        }
        int mid = (s + e) /2;

        mergeSortInPlace(arr,s,mid);
        mergeSortInPlace(arr, mid, e);
        mergeInPlace(arr,s,mid,e);
    }

    static void mergeInPlace(int[] arr, int s, int m, int e) {
        int[] mix = new int[e-s];
        int i = s;
        int j = m;
        int k = 0;

        while (i < m && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i < m) {
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }
        for(int l = 0; l < mix.length; l++ ){
            arr[s+l] = mix[l];
        }
    }
}

// optimize method
//static void mergeSortInPlace(int[] arr, int s, int e) {
//    if (e - s <= 1) { // Check if the subarray has only one element
//        return;
//    }
//    int mid = (s + e) / 2;
//
//    mergeSortInPlace(arr, s, mid);
//    mergeSortInPlace(arr, mid, e);
//    mergeInPlace(arr, s, mid, e);
//}
//
//    static void mergeInPlace(int[] arr, int s, int m, int e) {
//        int[] left = Arrays.copyOfRange(arr, s, m); // Create left subarray
//        int[] right = Arrays.copyOfRange(arr, m, e); // Create right subarray
//
//        int i = 0;
//        int j = 0;
//        int k = s;
//
//        while (i < left.length && j < right.length) {
//            if (left[i] < right[j]) {
//                arr[k] = left[i];
//                i++;
//            } else {
//                arr[k] = right[j];
//                j++;
//            }
//            k++;
//        }
//
//        while (i < left.length) {
//            arr[k] = left[i];
//            i++;
//            k++;
//        }
//
//        while (j < right.length) {
//            arr[k] = right[j];
//            j++;
//            k++;
//        }
//    }