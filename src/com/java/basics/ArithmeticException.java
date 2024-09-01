package com.java.basics;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticException {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            String name = sc.next();
            int age = sc.nextInt();
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Please provide a Valid Number");
        }
    }
}
