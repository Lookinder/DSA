package com.lookinder;

public class Packages {
    public static void main(String[] args) {

        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        System.out.println(shipWithinDays(weights, days));
    }

    static int shipWithinDays(int[] weights, int days) {
        int start = 0;
        int end = 0;
        for (int j : weights) {
            start = Math.max(start, j); //in the end of the loop this will contain max item from the array
            end += j;
        }

//        binary search
        while(start < end){
//            try for the middle as potential ans
            int mid = start + (end - start) / 2;

//            calculate how many pieces you can divide this in with this max sum
            int sum = 0;
            int pieces = 1;
            for(int num: weights){
                if(sum + num > mid){
//                    you cannot add this in this subarray, make new one
//                    say you add this num in new subarray, then sum = num
                    sum = num;
                    pieces++;
                }
                else{
                    sum +=num;
                }
            }
            if(pieces > days){
                start = mid +1;
            }
            else {
                end = mid;
            }
        }
        return  end;
    }

}
