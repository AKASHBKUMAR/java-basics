package com.java.basics;

public class Loops {
    public static void main(String[] args) {
        /*
            *The Do While Loop is Tested.

        int i = 1;
        do {
            System.out.println(i);
            i++;
        }while (i<10); */
        /*
            Testing of While loop to print numbers from 1 to 10

        int i = 1;
        while(
        {
            System.out.print(i+ " ");

        }

         */
        for (int iIterator = 0; iIterator < 5; iIterator++) {
            for (int jIterator = 0; jIterator <= iIterator; jIterator++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
