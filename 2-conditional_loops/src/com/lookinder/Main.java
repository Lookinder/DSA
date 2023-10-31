package com.lookinder;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        int r = sc.nextInt();
        int area = 22/7 *r*r;
        System.out.println(area);
    }
}
