package com.java.basics;

import java.util.StringTokenizer;

public class StringTokenizerHackerrank {
    public static void main(String[] args) {
        String s = "He is a very very good boy, isn't he?";
        StringTokenizer stringTokenizer = new StringTokenizer(s, " ~`!@#$%^&*()_-+=|\"\\{}[]':;?/><,.");
        System.out.println(stringTokenizer.countTokens());
        while (stringTokenizer.hasMoreTokens()) {
            System.out.println(stringTokenizer.nextToken());
        }
    }
}
