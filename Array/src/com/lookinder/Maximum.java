package com.lookinder;

public class Maximum {
    public static void main(String[] args) {
        int[] arr = {120,43,123,56,173,161,98};
        System.out.println(max(arr));
    }
    public static int max(int[] arr){
        int maxVal = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}