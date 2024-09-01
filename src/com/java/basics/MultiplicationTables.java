package com.java.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MultiplicationTables {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        for (int iterator = 1; iterator <= 10; iterator++) {
            int result = N * iterator;
            String output = String.format("%d x %d = %d", N, iterator, result);
            System.out.println(output);
        }

        bufferedReader.close();
    }
}
