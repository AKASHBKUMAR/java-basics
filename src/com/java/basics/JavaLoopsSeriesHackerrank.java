package com.java.basics;

public class JavaLoopsSeriesHackerrank {
    public static void main(String[] args) {
        int firstNumberInSeries = 5, secondNumberInSeries = 3, N = 5;
        int previousNumberInSeries = firstNumberInSeries + secondNumberInSeries;
        System.out.println(previousNumberInSeries);
        for (int iterator = 1; iterator < N; iterator++) {
            int nextNumberInSeries = (int) (previousNumberInSeries + (Math.pow(2, iterator) * secondNumberInSeries));
            System.out.println(nextNumberInSeries);
            previousNumberInSeries = nextNumberInSeries;
            System.out.println();
        }
    }
}
