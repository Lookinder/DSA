package com.lookinder;
import java.util.Scanner;

public class Hcflcm {
        public static void main(String[] args){
            int num1, num2, temp;
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter First Number: ");
            num1 = scanner.nextInt();
            System.out.print("Enter Second Number: ");
            num2 = scanner.nextInt();

            temp = Math.min(num1,num2);
            int hcf =0;
            int lcm;
            for (int i = 1; i <= temp; i++ ) {
                hcf = i;
            }
              lcm = (num1*num2)/hcf;

            System.out.println("HCF of input numbers: "+hcf);
            System.out.println("LCM of input numbers: "+lcm);
        }
    }

