package com.java.basics;

import java.util.Scanner;

public class JavaArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lengthOfArray = scanner.nextInt();
        int integerArray[] = new int[lengthOfArray];
        for (int iterator = 0; iterator < lengthOfArray; iterator++) {
            integerArray[iterator] = scanner.nextInt();
        }
        for (int iterator : integerArray) {
            System.out.println(iterator);
        }
    }
}
