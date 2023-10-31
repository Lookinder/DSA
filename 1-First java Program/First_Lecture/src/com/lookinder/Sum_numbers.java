package com.lookinder;

import java.util.Scanner;

public class Sum_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("The sum of these two numbers is " + (num1 + num2));
    }
}
