package com.lookinder;

import java.util.Scanner;

public class prob {
    public static void main(String[] args) {
        int ans = num();
        System.out.println(ans);
    }
    static int num(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter a another number: ");
        int n2 = sc.nextInt();
        return n1 + n2;
    }
}
