package com.lookinder;

import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many scores a player have: ");
        int runs = sc.nextInt();
        System.out.print("How many times he getting out: ");
        int out = sc.nextInt();

        double battingAverage = (runs/out);
        System.out.println(battingAverage);
    }
    }
