package com.lookinder;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

               if(marks <= 100 && marks >= 91){

                System.out.println("Grade: AA");
            }

                else if(marks <= 90 && marks >= 81) {
                    System.out.println("Grade: AB");
                }

                else if(marks <= 80 && marks >= 71) {
                    System.out.println("Grade: BB");
                }

                else if(marks <= 70 && marks >= 61) {
                    System.out.println("Grade: BC");
                }

                else if(marks <= 60 && marks >= 51) {
                    System.out.println("Grade: CD");
                }
                else{
                System.out.println("Fail");
        }

    }
}
