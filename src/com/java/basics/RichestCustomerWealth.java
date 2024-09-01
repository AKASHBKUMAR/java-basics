package com.java.basics;

import java.util.Arrays;

class RichestCustomerWealthSolution {
    public int maximumWealth(int[][] accounts) {
        int maximumWealth = 0;
        for (int iterator = 0; iterator < accounts.length; iterator++) {
            int sum = Arrays.stream(accounts[iterator]).sum();
            if (sum > maximumWealth) {
                maximumWealth = sum;
            }
        }
        return maximumWealth;
    }
}

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1, 2, 3}, {3, 2, 1}};
        RichestCustomerWealthSolution richestCustomerWealthSolution = new RichestCustomerWealthSolution();
        int result = richestCustomerWealthSolution.maximumWealth(accounts);
        System.out.println(result);
    }
}
