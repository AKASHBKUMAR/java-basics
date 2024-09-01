package com.java.basics;

public class JavaDataTypesHackerrank {
    public static void main(String[] args) {
        int N = 150;
        System.out.println((N >= Byte.MIN_VALUE && N <= Byte.MAX_VALUE) ? "byte" : "");
        System.out.println((N >= Short.MIN_VALUE && N <= Short.MAX_VALUE) ? "short" : "");
        System.out.println((N >= Integer.MIN_VALUE && N <= Integer.MAX_VALUE) ? "int" : "");
        System.out.println((N >= Long.MIN_VALUE && N <= Long.MAX_VALUE) ? "int" : "");
    }
}
