package com.lookinder;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 13;
        arr[2] = 43;
        arr[3] = 75;
        arr[4] = 433;
        System.out.println(arr[3]);

//        input using loops
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

//        for (int num : arr) {  //for every element in array, print element
//            System.out.print(num + " ");  // here num represents element of the array
//        }
        System.out.println(Arrays.toString(arr));
    }
}
