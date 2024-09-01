package com.java.basics;

public class JavaGFGPatterns {
    public static void main(String[] args) {
        int n = 3;
        int temp = n, another_temp = 3;
        int k = 0;
        while (temp > 0) {
            for (int iterator = 0; iterator < another_temp; iterator++) {
                for (int jIterator = 0; jIterator < temp; jIterator++) {
                    System.out.print(n + " ");
                }
                n--;
                System.out.println("$");

            }
            n = n + temp + k;
            temp--;
            k++;
        }
    }
}
