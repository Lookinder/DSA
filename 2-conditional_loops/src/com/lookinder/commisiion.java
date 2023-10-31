package com.lookinder;

import java.util.Scanner;

public class commisiion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();
        System.out.print("Enter commission percentage: ");
        double commissionPercentage = sc.nextDouble();

        double commission =(commissionPercentage/100)*amount;
        System.out.print("Commission is: " + commission);
    }
}
