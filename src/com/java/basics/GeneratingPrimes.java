package com.java.basics;

public class GeneratingPrimes {
    static boolean isPrime(int number) {
        int iterator = 2;
        while (iterator < number) {
            if (number % iterator == 0) {
                return false;
            }
            iterator++;
        }
        return true;
    }

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        GeneratingPrimes generatingPrimes = (GeneratingPrimes) Class.forName("com.java.basics.GeneratingPrimes").newInstance();
        generatingPrimes.generatePrimes();
    }

    void generatePrimes() {
        int iterator = 2;
        while (iterator <= 10) {
            if (isPrime(iterator)) {
                String result = String.format("%d is a Prime Number%%", iterator);
                System.out.println(result);
            }
            iterator++;
        }
    }
}
