package com.lookinder;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = sc.nextInt();
        System.out.println("Multiplication of " + num + " is ");
        for (int i = 1; i <= 20; i++) {
            System.out.println(num + " x " + i + " = " + (num*i));
        }

    }
}
