package com.lookinder;

import java.util.Arrays;

public class selection {
    public static void main(String[] args) {
        int[] nums = {3,7,4,9,6,1,2};
        insertion(nums);
        System.out.println(Arrays.toString(nums));


    }
    static void insertion(int[] nums){
        for(int i = 0; i < nums.length-1; i++){
            for(int j =i + 1; j>0; j--){
                if(nums[j] < nums[j-1]){
                    swap(nums, j,j-1);
                }
                else{
                    break;
                }
            }
        }
    }



    static void selectionsort(int[] nums){
        for (int i = 0; i < nums.length; i++){
            int last = nums.length -i -1;
            int maxIndex = getIndex(nums,0, last);
            swap(nums,maxIndex,last);
        }

    }

     static int getIndex(int[] nums, int start, int end) {
        int max = start;
         for (int i = start; i <= end; i++){
             if(nums[i] >= nums[max]) {
                 max = i;
             }
        }
        return max;
    }

    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

}
