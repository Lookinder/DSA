package com.lookinder;

public class Main {

    public static void main(String[] args) {
	// Write a program to find largest and smallest of three numbers.
        int ans = largest(8,512,1);
        System.out.println(ans);
        int ans2 = smallest(312,198,143);
        System.out.println(ans2);

    }

    public static int largest(int first, int second, int third){
        int max = Math.max(second, first);
        if(third >max){
            max = third;
        }
        return max;
    }

    public static int smallest(int first, int second, int third){
        int small = Math.min(second,first);
        if(third < small){
            small = third;
        }
        return small;
    }
}
