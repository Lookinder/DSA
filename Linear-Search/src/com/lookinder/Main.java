package com.lookinder;

public class Main {

    public static void main(String[] args) {
	int[] nums = {12,32,45,-26,67,-34,14,36,10,18,49};
    int target = 14;
    int ans = linearSearch(nums,target);
        System.out.println(ans);
    }

    static int linearSearch(int arr[], int target){
        if(arr.length == 0){
            return -1;
        }
//        run for loop
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
