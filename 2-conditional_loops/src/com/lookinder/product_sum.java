package com.lookinder;

public class product_sum {
    public static void main(String[] args) {
            int n= 234;
            int sum = 0;
            int product = 1;

            while( n > 0){
                sum = sum + (n%10);
                product = product * (n%10);
                n = n/10;
            }
        System.out.println(product - sum);
        }
    }

