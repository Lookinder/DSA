package com.lookinder;

import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = sc.nextDouble();
        System.out.print("Enter a power: ");
        double n = sc.nextDouble();
        System.out.println((int) Math.pow(num,n));
    }
}
