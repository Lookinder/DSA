package com.lookinder;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter units that you have to calculate the electricity bill amount: ");
        long units = sc.nextLong();

        double billPay;

        if(units < 200){
            billPay = units * 3.10;
        }
        else if(units >200 && units <= 500){
            billPay = (200 * 3.10) + (units - 200) * 4.70;
        }
        else{
            billPay = (200 * 3.10) + (300 * 4.70) + (units - 500) * 5.40;
        }

        System.out.println("Your Electricity Bill is: " + billPay);
    }

}
