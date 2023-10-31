package com.lookinder;

import java.util.Scanner;

public class palidrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Check weather it is palidrome or not?");
        int temp, sum = 0, r;
        temp = num;
        while (num > 0) {
            r = num % 10;
            sum = (sum * 10) + r;
            num = num / 10;
        }
            if (temp == sum)

                System.out.println(temp + " is a palidrome number");
            else
                System.out.println(temp + " is not a prime number");

        }
    }

