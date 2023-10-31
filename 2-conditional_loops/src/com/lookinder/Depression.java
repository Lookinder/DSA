package com.lookinder;

import java.util.Scanner;

public class Depression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter depression amount: ");
        int depression = sc.nextInt();
        System.out.print("Enter Rate percentage: ");
        int rate = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        int temp = depression;

        for (int i = 1; i <= year; i++) {
            temp = (100 - rate) * temp / 100;
        }
        System.out.println("Amount after depression: " + temp);
    }
}
