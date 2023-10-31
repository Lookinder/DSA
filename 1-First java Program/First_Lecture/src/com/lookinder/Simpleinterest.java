package com.lookinder;

import java.util.Scanner;

public class Simpleinterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle: ");
        float p = sc.nextFloat();
        System.out.println("Enter Time: ");
        float t = sc.nextFloat();
        System.out.println("Enter Rate: ");
        float r = sc.nextFloat();
        System.out.println("Calculating Simple Interest");

        float si = 0;
        si = (p*r*t/100);
        System.out.println(si);


    }
}
