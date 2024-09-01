package com.java.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FibonacciSeriesSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the count of Fibonacci: ");
        int fibonacciCount = Integer.parseInt(bufferedReader.readLine());

        int firstNumber = 0, secondNumber = 1;
        System.out.print(firstNumber + " ");
        System.out.print(secondNumber + " ");
        int thirdNumber = firstNumber + secondNumber;
        System.out.print(thirdNumber + " ");
        while ((fibonacciCount - 3) > 0) {
            firstNumber = secondNumber;
            secondNumber = thirdNumber;
            thirdNumber = firstNumber + secondNumber;
            System.out.print(thirdNumber + " ");
            fibonacciCount--;
        }


    }
}
