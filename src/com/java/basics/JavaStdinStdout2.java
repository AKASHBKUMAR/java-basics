package com.java.basics;

import java.util.Scanner;

public class JavaStdinStdout2 {
    public static void main(String[] args) {
//      Creating an Object for Scanner Class.
        Scanner scanner = new Scanner(System.in);
//      Getting Inputs from the User.
        int integerNumber = scanner.nextInt();
        double doubleNumber = scanner.nextDouble();
//      Skipping the \n Character released by the nextDouble method
        scanner.nextLine();
        String stringObject = scanner.nextLine();
//      Printing the result
        System.out.println("String: " + stringObject);
        System.out.println("Double: " + doubleNumber);
        System.out.println("Int: " + integerNumber);
    }
}
