package com.lookinder;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount of the product: ");
        int product = sc.nextInt();
        System.out.println("Enter discount percentage: ");
        int discount = sc.nextInt();

        int  discountAmount = (discount * product)/100;
        System.out.println(discountAmount);
    }
}
