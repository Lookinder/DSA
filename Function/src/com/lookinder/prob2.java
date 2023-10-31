package com.lookinder;

import java.util.Scanner;

public class prob2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second Number: ");
        int n2 = sc.nextInt();
        System.out.print("Enter third Number: ");
        int n3 = sc.nextInt();
        System.out.print("The smallest number is: " + smallest(n1, n2, n3));
    }
    public static int  smallest(int n1, int n2, int n3){
        return Math.min(Math.min(n1,n2),n3);
    }
}
