package com.java.basics;

import java.util.Scanner;

public class StringIntroduction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstStringObject = scanner.nextLine();
        String secondStringObject = scanner.nextLine();
        int lengthOfString = firstStringObject.length() + secondStringObject.length();
        System.out.println(lengthOfString);
        System.out.println(firstStringObject.compareTo(secondStringObject) > 0 ? "Yes" : "No");
        String finalString = String.format(firstStringObject.substring(0, 1).toUpperCase() + firstStringObject.substring(1) + " " + secondStringObject.substring(0, 1).toUpperCase() + secondStringObject.substring(1));
        System.out.println(finalString);


    }
}
