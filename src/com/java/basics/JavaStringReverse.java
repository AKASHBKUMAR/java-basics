package com.java.basics;

public class JavaStringReverse {
    public static void main(String[] args) {
        String stringObject = new String("Hello World");
        int stringLength = stringObject.length();
        for (int iterator = 0; iterator < stringLength / 2 + 1; iterator++) {
            if (stringObject.charAt(iterator) != stringObject.charAt(stringLength - iterator - 1)) {
                System.out.println("No");
                break;
            }
        }
        System.out.println("Yes");
    }
}
