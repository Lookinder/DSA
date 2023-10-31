package com.lookinder;

public class Maxwalth {
    public static void main(String[] args) {
        int[][] accounts = {{1, 2, 3}, {3, 2, 4,1}};
        int ans = getMaxWealth(accounts);
        System.out.println(ans);
    }

    public static int getMaxWealth(int[][] accounts) {
        int richest = 0;

        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            if (sum > richest) {
                richest = sum;
            }
        }

        return richest;
    }
}