package com.lookinder;

import java.util.Scanner;

public class AverageOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter of number: ");
        int n = sc.nextInt();
        int Avg;
        System.out.print("The of Average of " + n + " is: ");
        Avg = (1+n)/2;
        System.out.println(Avg);

    }
}
