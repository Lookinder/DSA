package com.lookinder;

public class PrimeNumber {
    public static void main(String[] args) {
        boolean num = prime(10);
        System.out.println(num);

    }
    public static boolean prime(int inputNumber){
        boolean isItPrime = true;

        if(inputNumber <= 1)
        {
            isItPrime = false;

            return isItPrime;
        }
        else
        {
            for (int i = 2; i<= inputNumber/2; i++)
            {
                if ((inputNumber % i) == 0)
                {
                    isItPrime = false;

                    break;
                }
            }

            return isItPrime;
        }
    }
}
