package com.java.basics;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SumOfPrimeExceptSmallestPrime {

    static int Sum(int[] input1, int input2) {
        int sum = 0;
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < input1.length; i++) {
            int flag = 0;
            for (int j = 1; j <= input1[i]; j++) {
                if (input1[i] % j == 0) {
                    flag++;
                }
            }
            if (flag == 2) {
                list.add(input1[i]);
            }
        }
        Collections.sort(list);
        for (int i = 1; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }

    public static void main(String[] args) {

        int result = SumOfPrimeExceptSmallestPrime.Sum(new int[]{10, 41, 18, 50, 43, 31, 29, 25, 59, 96, 67}, 11);
        System.out.println(result);
    }
}


